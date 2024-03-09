public class WaitNotifyExample2 {
	public static void main(String [] args) throws InterruptedException{
		Message message = new Message();
		Thread IC = new Thread(new IncrementClass(message));
		Thread DC = new Thread(new DecrementClass(message));
		
		IC.start();
		DC.start();
		
		IC.join();
		DC.join();
		System.out.println("Final Counter - "+message.getCount());
	}
}
class Message{
	private  int count=0;
	private boolean isReady;
	
	public synchronized void increment(){
		count=count+2;
		while(isReady){
		try{
			wait();
			System.out.println("waiting..");
		}
		catch(InterruptedException ae){
				
		}
		}
		isReady=true;
		notify();
		
	}
	public synchronized void decrement(){
		count++;
		while(!isReady){
		try{
			wait();
			System.out.println("waiting..");
		}
		catch(InterruptedException ae){
				
		}
		}
		isReady=false;
		notify();
		
	}
	
	public int getCount(){
		return count;
	}
}

class IncrementClass implements Runnable{
	Message message;
	IncrementClass(Message message){
		this.message=message;
	}
	public void run(){
		for (int i=0;i<10;i++){
			message.increment();
			System.out.println("Counter incremented - "+message.getCount());
			try{
			Thread.sleep(100);
			}
			catch(InterruptedException ae){
				
			}
		}
	}
}

class DecrementClass implements Runnable{
	Message message;
	DecrementClass(Message message){
		this.message=message;
	}
	public void run(){
		for (int i=0;i<10;i++){
			message.decrement();
			System.out.println("Counter decremented - "+message.getCount());
			try{
				Thread.sleep(100);
			}
			catch(InterruptedException ae){
				
			}
			
		}
	}
}


/*
D:\Final Interview\Core java\Mulitthreading\Coding>java WaitNotifyExample1.java
Counter incremented - 2
Counter decremented - 3
Counter incremented - 5
Counter decremented - 6
Counter decremented - 9
Counter incremented - 8
Counter incremented - 12
waiting..
Counter decremented - 12
Counter incremented - 14
Counter decremented - 15
Counter incremented - 17
Counter decremented - 18
waiting..
Counter decremented - 21
Counter incremented - 21
Counter incremented - 24
waiting..
Counter decremented - 24
Counter incremented - 26
Counter decremented - 27
Counter decremented - 30
Counter incremented - 29
Final Counter - 30

D:\Final Interview\Core java\Mulitthreading\Coding>


*/