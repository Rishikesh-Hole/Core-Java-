public class SynchronizationExample {
	public static void main(String [] args) throws InterruptedException {
		Counter counter = new Counter();

		IncrementerThread thread1 = new IncrementerThread(counter);
		IncrementerThread thread2 = new IncrementerThread(counter);
		
		// Starting the threads
		thread1.start();
		
		thread2.start();
		
		//wait for both thread to complete
		thread1.join();
		thread2.join();
		
		System.out.println("Final Count: " + counter.getCount());
		
	}
}

class Counter{
	private int count=0;
	
	public synchronized void increment(){
		count ++;
	}
	
	public synchronized int getCount(){
		return count;
	}
}

class IncrementerThread extends Thread{
	private Counter counter;
	
	IncrementerThread(Counter counter){
		this.counter=counter;
	}
	
	@Override
	public void run(){
		for (int i=0; i<100; i++){
			counter.increment();
		}
	}
}