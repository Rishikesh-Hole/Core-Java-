public class WaitNotifyAllExample {
    public static void main(String[] args) {
        Message message = new Message();

        // Create two producer threads and one consumer thread
        Thread producer1 = new Thread(new Producer(message, "Producer 1"));
        Thread producer2 = new Thread(new Producer(message, "Producer 2"));
        Thread consumer = new Thread(new Consumer(message));
		consumer.setPriority(8);
		System.out.println("producer1 priority - " + producer1.getPriority());
		System.out.println("producer2 priority - " + producer2.getPriority());
		System.out.println("consumer priority - " + consumer.getPriority());
        // Start all threads
        producer1.start();
        producer2.start();
        consumer.start();
    }
}

class Message {
    private String message;
    private boolean isReady;

    public synchronized void setMessage(String message) {
        while (isReady) {
            try {
                wait(); // Wait for consumers to consume messages
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        this.message = message;
        isReady = true;
        notifyAll(); // Notify all waiting consumers
    }

    public synchronized String getMessage() {
        while (!isReady) {
            try {
                wait(); // Wait for producers to produce messages
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        isReady = false;
        notifyAll(); // Notify all waiting producers
        return message;
    }
}

class Producer implements Runnable {
    private final Message message;
    private final String producerName;

    public Producer(Message message, String producerName) {
        this.message = message;
        this.producerName = producerName;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            message.setMessage(producerName + ": Message " + i);
            System.out.println(producerName + ": Produced: Message " + i);
            try {
                Thread.sleep(1000); // Introducing delay for illustration purposes
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

class Consumer implements Runnable {
    private final Message message;

    public Consumer(Message message) {
        this.message = message;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            String consumedMessage = message.getMessage();
            System.out.println("Consumed: " + consumedMessage);
            try {
                Thread.sleep(1000); // Introducing delay for illustration purposes
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}


/*
D:\Final Interview\Core java\Mulitthreading\Coding>java WaitNotifyAllExample.java
 producer1 priority - 5
 producer2 priority - 5
 consumer priority - 8
Producer 1: Produced: Message 1
Producer 2: Produced: Message 1
Consumed: Producer 1: Message 1
Producer 1: Produced: Message 2
Consumed: Producer 2: Message 1
Producer 2: Produced: Message 2
Consumed: Producer 1: Message 2
Producer 2: Produced: Message 3
Consumed: Producer 2: Message 2
Consumed: Producer 2: Message 3
Producer 2: Produced: Message 4
Consumed: Producer 2: Message 4
Producer 1: Produced: Message 3
Consumed: Producer 1: Message 3
Producer 2: Produced: Message 5
Consumed: Producer 2: Message 5
Producer 1: Produced: Message 4
Producer 1: Produced: Message 5
Consumed: Producer 1: Message 4
Consumed: Producer 1: Message 5

D:\Final Interview\Core java\Mulitthreading\Coding>

*/