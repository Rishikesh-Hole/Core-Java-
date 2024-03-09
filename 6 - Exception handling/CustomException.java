//Checked user defined exceptions
public class CustomException extends Exception{
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
	public static void main(String [] args) throws CustomException{
		m1();
		m2();
	}
	static void m2() throws CustomException{
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




/*

D:\Final Interview\Core java\Coding practice\6 - Exception handling>java CustomExceptionTest
In m1() !!
In m2() !!
CustomException: This is a custom exception !!
        at CustomExceptionTest.m2(CustomException.java:28)
        at CustomExceptionTest.main(CustomException.java:20)
Caused by: java.lang.ArithmeticException: / by zero
        at CustomExceptionTest.m2(CustomException.java:25)
        ... 1 more
Exception in thread "main" CustomException: This is a custom exception !!
        at CustomExceptionTest.m2(CustomException.java:28)
        at CustomExceptionTest.main(CustomException.java:20)
Caused by: java.lang.ArithmeticException: / by zero
        at CustomExceptionTest.m2(CustomException.java:25)
        ... 1 more

D:\Final Interview\Core java\Coding practice\6 - Exception handling>

*/