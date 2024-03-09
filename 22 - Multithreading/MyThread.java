class MyThread extends Thread{
	public void run(){
		System.out.println("Inside run!!");
		System.out.println(getName());
	}
	
	public static void main(String [] args){
		System.out.println("Inside main!!");
		
		MyThread th1 = new MyThread();
		th1.start();
		System.out.println(th1.getName());
		
		Thread mainThread = Thread.currentThread();
		System.out.println("Main thread name - " +  mainThread.getName());
		System.out.println("Main thread name - " +  Thread.currentThread().getName());
	}
}