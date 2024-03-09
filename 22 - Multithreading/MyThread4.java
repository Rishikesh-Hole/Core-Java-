class MyThread extends Thread {
    public void myStart() {
        System.out.println("Performing custom initialization");
        // Perform any custom initialization here

        // Calling run() directly runs the method in the current thread
        run();
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " Value " + i);
        }
    }
	
	public static void main(String[] args) {
        MyThread thread1 = new MyThread();

        // Calling myStart, which internally calls run() directly
        thread1.myStart();
    }
}

/*
D:\Final Interview\Core java\Mulitthreading\Coding>java MyThread4.java
Performing custom initialization
main Value 1
main Value 2
main Value 3
main Value 4
main Value 5

D:\Final Interview\Core java\Mulitthreading\Coding>

*/

class MyThread extends Thread {
    public void myStart() {
        System.out.println("Performing custom initialization");
        // Perform any custom initialization here

        // Calling run() directly runs the method in the current thread
        super.run();
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " Value " + i);
        }
    }
	
	public static void main(String[] args) {
        MyThread thread1 = new MyThread();

        // Calling myStart, which internally calls run() directly
        thread1.myStart();
    }
}

/*

D:\Final Interview\Core java\Mulitthreading\Coding>java MyThread4.java
Performing custom initialization

D:\Final Interview\Core java\Mulitthreading\Coding>

*/


class MyThread extends Thread {
    public void myStart() {
        System.out.println("Performing custom initialization");
        // Perform any custom initialization here

        // Calling run() directly runs the method in the current thread
        super.start();
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " Value " + i);
        }
    }
	
	public static void main(String[] args) {
        MyThread thread1 = new MyThread();

        // Calling myStart, which internally calls run() directly
        thread1.myStart();
    }
}


/*
D:\Final Interview\Core java\Mulitthreading\Coding>java MyThread4.java
Performing custom initialization
Thread-0 Value 1
Thread-0 Value 2
Thread-0 Value 3
Thread-0 Value 4
Thread-0 Value 5

D:\Final Interview\Core java\Mulitthreading\Coding>
*/