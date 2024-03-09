import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
class ExecuterTest implements Runnable{
	String taskName;
	ExecuterTest(String a){
		taskName=a;
	}
	@Override
	public void run(){
		System.out.println("Thread name - "+Thread.currentThread().getName()+" | Executitng task - " + taskName);
		try{
			Thread.sleep(100);
		}
		catch(Exception e){
			
		}
	}
	
	public static void main(String [] args){
		ExecutorService ES = Executors.newFixedThreadPool(4);
		
		for (int i=0; i<10;i++){
			String taskName = "Task-"+i;
			ExecuterTest task = new ExecuterTest(taskName);
			
			ES.submit(task);
		}
		ES.shutdown();
	}
}


/* you can use try with resource as well like below-
	public static void main(String [] args){
		try(ExecutorService ES = Executors.newFixedThreadPool(4)){
		
		for (int i=0; i<10;i++){
			String taskName = "Task-"+i;
			ExecuterTest task = new ExecuterTest(taskName);
			
			ES.submit(task);
		}
		}
		catch(Exception e){
			
		}
		//ES.shutdown();
	}
*/