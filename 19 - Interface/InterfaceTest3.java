// interface 
class ABC implements InterfaceTest2, InterfaceTest1{
	public static void main(String [] args){
		System.out.println("Inside ABC - main() method !!");
		ABC A = new ABC();
		A.m1();
	}
	
	public void m1()
	{
		//InterfaceTest1.m1(); // error: non-static method m1() cannot be referenced from a static context
		//InterfaceTest2.m1(); // error: non-static method m1() cannot be referenced from a static context
		InterfaceTest1.super.m1();  // calling InterfaceTest1 default method
		InterfaceTest2.super.m1();
	}
}



interface InterfaceTest1{
	int a=10;
	default void m1(){
		System.out.println("Inside InterfaceTest1 - default void m1() !!");
		m2();
		m3();
	}
	
	private void m2(){
		System.out.println("Inside InterfaceTest1 - private void m2() !!");
	}
	
	static private void m3(){
		System.out.println("Inside InterfaceTest1 - private void m3() !!");
	}	

	static void m4(){
		System.out.println("Inside InterfaceTest1 - static void m4() !!");
		// m2(); -- rror: non-static method m2() cannot be referenced from a static context
		m3();
	}
	
}

interface InterfaceTest2{
	int a=10;
	default void m1(){
		System.out.println("Inside InterfaceTest2 - default void m1() !!");
		m2();
		m3();
	}
	
	private void m2(){
		System.out.println("Inside InterfaceTest2 - private void m2() !!");
	}
	
	static private void m3(){
		System.out.println("Inside InterfaceTest2 - private void m3() !!");
	}	

	static void m4(){
		System.out.println("Inside InterfaceTest2 - static void m4() !!");
		// m2(); -- rror: non-static method m2() cannot be referenced from a static context
		m3();
	}
	
}

/*
D:\Final Interview\Core java\interface\coding>java InterfaceTest3.java
InterfaceTest3.java:2: error: types InterfaceTest2 and InterfaceTest1 are incompatible;
class ABC implements InterfaceTest2, InterfaceTest1{
^
  class ABC inherits unrelated defaults for m1() from types InterfaceTest2 and InterfaceTest1
1 error
error: compilation failed

D:\Final Interview\Core java\interface\coding>
*/

/*

## after commenting m1() of InterfaceTest1
D:\Final Interview\Core java\interface\coding>java InterfaceTest3.java
Inside ABC - main() method !!

D:\Final Interview\Core java\interface\coding>

*/


/*

## after commenting m1() of InterfaceTest2
D:\Final Interview\Core java\interface\coding>java InterfaceTest3.java
Inside ABC - main() method !!

D:\Final Interview\Core java\interface\coding>

*/


/*
## after overriding m1() inside ABC class

D:\Final Interview\Core java\interface\coding>java InterfaceTest3.java
Inside ABC - main() method !!
Inside InterfaceTest1 - default void m1() !!
Inside InterfaceTest1 - private void m2() !!
Inside InterfaceTest1 - private void m3() !!
Inside InterfaceTest2 - default void m1() !!
Inside InterfaceTest2 - private void m2() !!
Inside InterfaceTest2 - private void m3() !!

D:\Final Interview\Core java\interface\coding>


*/