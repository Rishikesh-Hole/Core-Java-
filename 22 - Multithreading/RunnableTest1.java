// creating multiple threads from same or different class

class RunnableTest1 implements Runnable{
	int a;
	RunnableTest1(){
		
	}
	RunnableTest1(int a){
		this.a=a;
	}
	public void run(){
		System.out.println("RunnableTest1 - Inside run() - !!");
		System.out.println("RunnableTest1 - Thread name : "+Thread.currentThread().getName());
		System.out.println("a is - "+a);
	}
	
	public static void main(String [] args){
		System.out.println("Inside main!!");
		
		RunnableTest1 RT1 = new RunnableTest1();
		RunnableTest1 RT2 = new RunnableTest1(10);
				
		Thread childThread = new Thread(RT1);
		Thread childThread2 = new Thread(RT2);
		childThread.start();
		childThread2.start();
		RT1.run();
		
		RunnableTest2 RT3 = new RunnableTest2();
		Thread childThread3 = new Thread(RT3);
		childThread3.start();
		
		//childThread.start(); // java.lang.IllegalThreadStateException  - second execution of start on same thread is not allowed
	}
}

class RunnableTest2 implements Runnable{
	public void run(){
		System.out.println("RunnableTest2 - Inside run() - !!");
		System.out.println("RunnableTest2 - Thread name : "+Thread.currentThread().getName());
	}
}