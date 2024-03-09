public class MyThread extends Thread {
    @Override
    public void start() {
        System.out.println("Performing custom initialization");
        // Perform any custom initialization here

        // Call the super class's start method to start the thread
		run();
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " Value " + i + "  "+getName());
        }
    }

    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
		thread1.setName("Hero");

        // Start the thread using the custom start method
        thread1.start();
		System.out.println(Thread.currentThread().getName());
		System.out.println(thread1.getName());
    }
}


/*
D:\Final Interview\Core java\Mulitthreading\Coding>java MyThread5.java
Performing custom initialization
main Value 1  Hero
main Value 2  Hero
main Value 3  Hero
main Value 4  Hero
main Value 5  Hero
main
Hero

D:\Final Interview\Core java\Mulitthreading\Coding>

*/
public class MyThread extends Thread {
    @Override
    public void start() {
        System.out.println("Performing custom initialization");
        // Perform any custom initialization here

        // Call the super class's start method to start the thread
        super.start();
		
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " Value " + i + "  "+getName());
        }
    }

    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
		thread1.setName("Hero");

        // Start the thread using the custom start method
        thread1.start();
		System.out.println(Thread.currentThread().getName());
		System.out.println(thread1.getName());
    }
}


/*
D:\Final Interview\Core java\Mulitthreading\Coding>java MyThread5.java
Performing custom initialization
main
Hero
Hero Value 1  Hero
Hero Value 2  Hero
Hero Value 3  Hero
Hero Value 4  Hero
Hero Value 5  Hero

D:\Final Interview\Core java\Mulitthreading\Coding>

*/