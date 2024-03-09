// Allowed member types in interface 

class InterfaceTest implements A{
	//error: InterfaceTest is not abstract and does not override abstract method m1() in A
	public void m1(){ // need to override 
		
	}
	
	static void m3(){ // we can write a static method with same prototype as of interface static method
		System.out.println("Inside InterfaceTest - public void m3() !!");
	}
	
	public static void main(String [] args){
		System.out.println("Inside main mathod !!");
		InterfaceTest I1 = new InterfaceTest();
		A.m3(); // calling static method of interface
		A a1 =null;
		// a1.m3();  -- error: illegal static interface method call, can not be access through interface reference variable
		// I1.m3(); --  error: cannot find symbol, static interface method can not be access through instance of implementing class
		I1.m1();
		
		A.m3();  // will call A interface m3() method
		I1.m3(); // will call InterfaceTest class m3() method
		
		A I2 = new InterfaceTest();
		// I2.m3(); -- error: illegal static interface method call
	}
}
interface A {
	//int a; -- error: = expected
	int a=10; // we must initialize all variables because all  interface variables are by default public static final
	void m1();
	//default void m2(); --error: missing method body, or declare abstract 
	default void m2(){  // default method of interface can not be abstract. It must have a body.
		System.out.println("Inside A - default void m2() !!");
	}
	class innerclass{    // This inner class is by default "public static"
		
	}
	//static void m3(); -- error: missing method body, or declare abstract
	static void m3(){ // static method of interface can not be abstract. It must have a body.
		System.out.println("Inside A - static void m3() !!");
	}
	//private void m4(); -- error: missing method body, or declare abstract
	private void m4(){ // private method of interface can not be abstract. It must have a body.
		
	} // interface private method can not be inherited into subclass
	
	default void m2(int a){ // default method overloading inside interface
		
	}
	
	
}
