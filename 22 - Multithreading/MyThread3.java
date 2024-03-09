public class ThreadExample {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();

        // Start the thread using the custom start method
        thread1.start();
    }
}


class MyThread extends Thread {
    @Override
    public void start() {
        System.out.println("Performing custom initialization");
        // Perform any custom initialization here

        // Call the super class's start method to start the thread
        //super.start();
		run();
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " Value " + i);
        }
    }
}

