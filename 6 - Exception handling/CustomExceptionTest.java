//UnChecked user defined exceptions
public class CustomException2 extends RuntimeException{
	CustomException()
	{
		super();
	}
	
	CustomException(String message){
		super(message);
	}
	
	CustomException(String message, Throwable cause){
		super(message,cause);
	}
}

class CustomExceptionTest{
	public static void main(String [] args){
		m1();
		m2();
	}
	static void m2(){
		try{ 
		System.out.println("In m2() !!");
		System.out.println(10/0);
		}
		catch (ArithmeticException ae){
			CustomException cexp =  new CustomException("This is a custom exception !!", ae);
			cexp.printStackTrace();
			throw cexp;
		}
		
	}
	
	static void m1(){
		System.out.println("In m1() !!");
	}
}


