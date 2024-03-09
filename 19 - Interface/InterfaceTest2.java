// private method testing
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

