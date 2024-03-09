// getName, setName,getPriority, setPriority

class MyThreadTest6 extends Thread{
	public void run(){
		System.out.println("Inside My Thread");
	}
	
	public String toString(){
		return "[ Thread:"+getName()+" Group:"+getThreadGroup().getName()+" Priority:"+getPriority()+" ]";
	}
	
	
	public static void main(String [] args){
		MyThreadTest6 TH1 = new MyThreadTest6();
		System.out.println("TH1 Thread name " + TH1.getName());
		TH1.setName("Hero");
		
		System.out.println("TH1 Thread name " + TH1.getName());
		System.out.println("Main Thread name " + Thread.currentThread().getName());
		
		System.out.println("TH1 Thread name " + TH1.getPriority());
		System.out.println("Main Thread name " + Thread.currentThread().getPriority());
		
		TH1.setPriority(6);
		Thread.currentThread().setPriority(2);
		
		System.out.println("TH1 Thread name " + TH1.getPriority());
		System.out.println("Main Thread name " + Thread.currentThread().getPriority());
		
		System.out.println("TH1 Thread Group name " + TH1.getThreadGroup().getName());
		System.out.println("Main Thread Group name " + Thread.currentThread().getThreadGroup().getName());		
		
		TH1.start();
		
		System.out.println(TH1);
		System.out.println(Thread.currentThread());
	
	}
}

/*
D:\Final Interview\Core java\Mulitthreading\Coding>java MyThread6.java
TH1 Thread name Thread-0
TH1 Thread name Hero
Main Thread name main
TH1 Thread name 5
Main Thread name 5
TH1 Thread name 6
Main Thread name 2
TH1 Thread Group name main
Main Thread Group name main
Inside My Thread
[ Thread:Hero Group:main Priority:6 ]
Thread[#1,main,2,main]

D:\Final Interview\Core java\Mulitthreading\Coding>
*/