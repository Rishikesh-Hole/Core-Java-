public class WaitNotifyExample {
    public static void main(String[] args) {
        Message message = new Message();

        // Create two threads: one producer and one consumer
        Thread producer = new Thread(new Producer(message));
        Thread consumer = new Thread(new Consumer(message));

        // Start both threads
        producer.start();
        consumer.start();
    }
}

// A shared Message object with a flag to indicate whether it is ready to be consumed
class Message {
    private String message;
    private boolean isReady;

    // Getter and setter methods for message and isReady

    public synchronized void setMessage(String message) {
        while (isReady) {
            try {
                wait(); // Wait for the consumer to consume the message
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        this.message = message;
        isReady = true;
        notify(); // Notify the consumer that a message is ready
    }

    public synchronized String getMessage() {
        while (!isReady) {
            try {
                wait(); // Wait for the producer to produce a message
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        isReady = false;
        notify(); // Notify the producer that the message has been consumed
        return message;
    }
}

// Producer thread to set a message
class Producer implements Runnable {
    private final Message message;

    public Producer(Message message) {
        this.message = message;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            message.setMessage("Message " + i);
            System.out.println("Produced: " + "Message " + i);
            try {
                Thread.sleep(1000); // Introducing delay for illustration purposes
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

// Consumer thread to consume a message
class Consumer implements Runnable {
    private final Message message;

    public Consumer(Message message) {
        this.message = message;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
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
