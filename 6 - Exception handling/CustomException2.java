//UnChecked user defined exceptions
public class CustomException2 extends RuntimeException{
	CustomException2()
	{
		super();
	}
	
	CustomException2(String message){
		super(message);
	}
	
	CustomException2(String message, Throwable cause){ //used for exception chaining
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
			CustomException2 cexp =  new CustomException2("This is a custom exception !!", ae); 
			//cexp.printStackTrace();
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
CustomException2: This is a custom exception !!
        at CustomExceptionTest.m2(CustomException2.java:28)
        at CustomExceptionTest.main(CustomException2.java:20)
Caused by: java.lang.ArithmeticException: / by zero
        at CustomExceptionTest.m2(CustomException2.java:25)
        ... 1 more
Exception in thread "main" CustomException2: This is a custom exception !!
        at CustomExceptionTest.m2(CustomException2.java:28)
        at CustomExceptionTest.main(CustomException2.java:20)
Caused by: java.lang.ArithmeticException: / by zero
        at CustomExceptionTest.m2(CustomException2.java:25)
        ... 1 more




*/


/*
D:\Final Interview\Core java\Coding practice\6 - Exception handling>javac CustomException2.java

D:\Final Interview\Core java\Coding practice\6 - Exception handling>java CustomExceptionTest
In m1() !!
In m2() !!
Exception in thread "main" CustomException2: This is a custom exception !!
        at CustomExceptionTest.m2(CustomException2.java:28)
        at CustomExceptionTest.main(CustomException2.java:20)
Caused by: java.lang.ArithmeticException: / by zero
        at CustomExceptionTest.m2(CustomException2.java:25)
        ... 1 more

D:\Final Interview\Core java\Coding practice\6 - Exception handling>
*/