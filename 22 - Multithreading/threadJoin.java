// Daemon thread demo
class MyThreadTest7 extends Thread{
	public void run(){
		System.out.println("Inside Thread " + getName());
		for (int i=1; i<11; i++){
			System.out.println(getName() + " " + i);
		}
	}
	
	public String toString(){
		return "[ Thread:"+getName()+" Group:"+getThreadGroup().getName()+" Priority:"+getPriority()+" ]";
	}
	
	
	public static void main(String [] args) throws InterruptedException{
		MyThreadTest7 TH1 = new MyThreadTest7();
		TH1.setName("Child-1");

		MyThreadTest7 TH2 = new MyThreadTest7();
		TH2.setName("Child-2");

		TH1.start();
		TH2.start();
		
		/*for (int i=101; i<105; i++){
			System.out.println(Thread.currentThread().getName() + " " + i);
		}*/
		TH1.join();
		//TH1.join(100);
		TH2.join();
		System.out.println("Ending main Thread");
	
	}
}

/*

D:\Final Interview\Core java\Mulitthreading\Coding>java threadJoin.java
Inside Thread Child-1
Inside Thread Child-2
Child-1 1
Child-2 1
Child-1 2
Child-2 2
Child-2 3
Child-2 4
Child-2 5
Child-1 3
Child-2 6
Child-2 7
Child-2 8
Child-2 9
Child-2 10
Child-1 4
Child-1 5
Child-1 6
Child-1 7
Child-1 8
Child-1 9
Child-1 10
Ending main Thread

D:\Final Interview\Core java\Mulitthreading\Coding>
*/