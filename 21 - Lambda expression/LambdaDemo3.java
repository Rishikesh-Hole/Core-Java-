// Multithreading
class LambdaDemo3{
public static void main(String [] args){
	System.out.println("Inside main method");
	
	Runnable basic = ()->{
		String threadName = Thread.currentThread().getName();
		System.out.println("Method is running from  - " + threadName);
	};
	
	Thread TH1 = new Thread(basic);
	Thread TH2 = new Thread(basic);
	
	TH1.start();
	TH2.start();
}
}

/*

D:\Final Interview\Core java\Lambda expression\coding>java LambdaDemo3.java
Inside main method
Method is running from  - Thread-1
Method is running from  - Thread-0

D:\Final Interview\Core java\Lambda expression\coding>

*/