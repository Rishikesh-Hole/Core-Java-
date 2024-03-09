
public class JoinExample {
    public static void main(String[] args) throws InterruptedException {
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();

        // Start the first thread
        thread1.start();
		
		// Start the second thread
        thread2.start();
		
		// Use join to wait for thread1 to complete
		thread1.join();
        // Use join to wait for thread1 to complete
        thread2.join();
		
        // Print a message after both threads complete
        System.out.println("Both threads have completed.");
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " Value " + i);
        }
    }
}

/*
D:\Final Interview\Core java\Mulitthreading\Coding>java JoinExample.java
Thread-0 Value 1
Thread-0 Value 2
Thread-0 Value 3
Thread-0 Value 4
Thread-1 Value 1
Thread-0 Value 5
Thread-1 Value 2
Thread-1 Value 3
Thread-1 Value 4
Thread-1 Value 5
Both threads have completed.

D:\Final Interview\Core java\Mulitthreading\Coding>
*/

/*
public class JoinExample {
    public static void main(String[] args) throws InterruptedException {
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();

        // Start the first thread
        thread1.start();

        // Use join to wait for thread1 to complete
        thread1.join();

        // Start the second thread
        thread2.start();
		
		thread2.join();

        // Print a message after both threads complete
        System.out.println("Both threads have completed.");
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " Value " + i);
        }
    }
}

/*
D:\Final Interview\Core java\Mulitthreading\Coding>java JoinExample.java
Thread-0 Value 1
Thread-0 Value 2
Thread-0 Value 3
Thread-0 Value 4
Thread-0 Value 5
Thread-1 Value 1
Thread-1 Value 2
Thread-1 Value 3
Thread-1 Value 4
Thread-1 Value 5
Both threads have completed.

D:\Final Interview\Core java\Mulitthreading\Coding>
*/

/*
public class JoinExample {
    public static void main(String[] args) throws InterruptedException {
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();

        // Start the first thread
        thread1.start();

        // Use join to wait for thread1 to complete
        thread1.join();

        // Start the second thread
        thread2.start();
		
		

        // Print a message after both threads complete
        System.out.println("Both threads have completed.");
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " Value " + i);
        }
    }
}

*/
/*
D:\Final Interview\Core java\Mulitthreading\Coding>java JoinExample.java
Thread-0 Value 1
Thread-0 Value 2
Thread-0 Value 3
Thread-0 Value 4
Thread-0 Value 5
Both threads have completed.
Thread-1 Value 1
Thread-1 Value 2
Thread-1 Value 3
Thread-1 Value 4
Thread-1 Value 5

D:\Final Interview\Core java\Mulitthreading\Coding>
*/