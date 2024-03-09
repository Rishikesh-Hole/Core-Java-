public class DeadlockExample {
    // Two shared resources
    private static final Object resource1 = new Object();
    private static final Object resource2 = new Object();

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println("Thread 1: Holding resource 1");

                try {
                    // Introducing a delay to increase the likelihood of deadlock
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("Thread 1: Waiting for resource 2");
                synchronized (resource2) {
                    System.out.println("Thread 1: Holding resource 1 and resource 2");
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (resource2) {
                System.out.println("Thread 2: Holding resource 2");

                try {
                    // Introducing a delay to increase the likelihood of deadlock
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("Thread 2: Waiting for resource 1");
                synchronized (resource1) {
                    System.out.println("Thread 2: Holding resource 2 and resource 1");
                }
            }
        });

        // Start both threads
        thread1.start();
        thread2.start();
    }
}


/*

D:\Final Interview\Core java\Mulitthreading\Coding>java DeadlockExample
Thread 1: Holding resource 1
Thread 2: Holding resource 2
Thread 1: Waiting for resource 2
Thread 2: Waiting for resource 1

*/