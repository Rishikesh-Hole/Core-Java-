// Daemon thread demo
class MyThreadTest7 extends Thread{
	public void run(){
		System.out.println("Inside Thread " + getName());
		for (int i=1; i<20; i++){
			System.out.println(getName() + " " + i);
		}
	}
	
	public String toString(){
		return "[ Thread:"+getName()+" Group:"+getThreadGroup().getName()+" Priority:"+getPriority()+" ]";
	}
	
	
	public static void main(String [] args) throws InterruptedException{
		MyThreadTest7 TH1 = new MyThreadTest7();
		TH1.setName("Child");
		TH1.setDaemon(true);
		TH1.start();
		
		for (int i=101; i<105; i++){
			System.out.println(Thread.currentThread().getName() + " " + i);
		}
		Thread.currentThread().sleep(10);
		System.out.println("Ending main Thread");
	
	}
}

/*
D:\Final Interview\Core java\Mulitthreading\Coding>java ThreadSleep.java
Inside Thread Child
Child 1
Child 2
main 101
Child 3
main 102
main 103
Child 4
Child 5
main 104
Child 6
Child 7
Child 8
Child 9
Child 10
Child 11
Child 12
Child 13
Child 14
Child 15
Child 16
Child 17
Child 18
Child 19
Ending main Thread

D:\Final Interview\Core java\Mulitthreading\Coding>java ThreadSleep.java
Inside Thread Child
main 101
main 102
main 103
main 104
Child 1
Child 2
Child 3
Child 4
Child 5
Child 6
Child 7
Child 8
Child 9
Child 10
Child 11
Child 12
Child 13
Child 14
Child 15
Child 16
Child 17
Child 18
Ending main Thread
Child 19

D:\Final Interview\Core java\Mulitthreading\Coding

*/