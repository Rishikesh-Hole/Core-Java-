class ThrowTest{
	public static void main(String [] args){
		m1();
		m2();
	}
	
	static void m1(){
		System.out.println("In m1()");
		throw new ArithmeticException();
	}
	
	static void m2(){
		System.out.println("In m2()");
		throw new InterruptedException();
	}
}

/*
D:\Final Interview\Core java\Coding practice\6 - Exception handling>java ThrowTest.java
ThrowTest.java:14: error: unreported exception InterruptedException; must be caught or declared to be thrown
                throw new InterruptedException();
                ^
1 error
error: compilation failed

D:\Final Interview\Core java\Coding practice\6 - Exception handling>

*/

class ThrowTest{
	public static void main(String [] args) throws InterruptedException, ArithmeticException{
		m1();
		m2();
	}
	
	static void m1() throws ArithmeticException{
		System.out.println("In m1()");
		throw new ArithmeticException();
	}
	
	static void m2() throws InterruptedException{
		System.out.println("In m2()");
		throw new InterruptedException();
		
		}
}




/*
D:\Final Interview\Core java\Coding practice\6 - Exception handling>java ThrowTest.java
In m1()
Exception in thread "main" java.lang.ArithmeticException
        at ThrowTest.m1(ThrowTest.java:9)
        at ThrowTest.main(ThrowTest.java:3)

D:\Final Interview\Core java\Coding practice\6 - Exception handling>

*/


class ThrowTest{
	public static void main(String [] args) throws InterruptedException, ArithmeticException{
		m1();
		m2();
	}
	
	static void m1() throws ArithmeticException{
		System.out.println("In m1()");
		//throw new ArithmeticException();
	}
	
	static void m2() throws InterruptedException{
		System.out.println("In m2()");
		throw new InterruptedException();
		
		}
}


D:\Final Interview\Core java\Coding practice\6 - Exception handling>java ThrowTest.java
In m1()
In m2()
Exception in thread "main" java.lang.InterruptedException
        at ThrowTest.m2(ThrowTest.java:14)
        at ThrowTest.main(ThrowTest.java:4)

D:\Final Interview\Core java\Coding practice\6 - Exception handling>
