class RunnableTest implements Runnable{
	public void run(){
		System.out.println("Inside run() - !!");
		System.out.println("Thread name : "+Thread.currentThread().getName());
	}
	
	public static void main(String [] args){
		System.out.println("Inside main!!");
		
		RunnableTest RT1 = new RunnableTest();
				
		Thread childThread = new Thread(RT1);
		childThread.start();
		RT1.run();
	}
}

/*

D:\Final Interview\Core java\Mulitthreading\Coding>java MyThread1.java
Inside main!!
Inside run() - !!
Inside run() - !!
Thread name : Thread-0
Thread name : main

D:\Final Interview\Core java\Mulitthreading\Coding>

*/