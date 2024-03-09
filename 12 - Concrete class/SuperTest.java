class SuperTest extends B{
	void m3(){
		System.out.println("Inside C class - m3() ");
		super.m1();
		super.m2();
	}
	
	public static void main(String [] args){
		System.out.println("Inside main method ");
		SuperTest S1 = new SuperTest();
		S1.m3();
	}
}

class A{
	int a;
	int b;
	static int d;
	
	A(){
		a=10;
		b=10;
	}
	A(int a, int b){
		this.a=a;
		this.b=b;
	}
	
	void m1(){
		System.out.println("Inside A class - m1() ");
	}
	static void m2(){
		System.out.println("Inside A class - static m2() ");
	}
}

class B extends A{
	int c;
	int b;
	
	B(){
		c=20;
		b=20;
	}
	B(int c, int b){
		this.c=c;
		this.b=b;
	}
	
	void m1(){
		System.out.println("Inside B class - m1() ");
		super.m1();
		// super. is allowed inside static members.
		super.m2();
		System.out.println(super.d);
	}
	static void m2(){
		System.out.println("Inside B class - static m2() ");
		
		// super. is not allowed inside static members.
		
		//super.m1(); error: non-static variable super cannot be referenced from a static context
		//super.m2(); error: non-static variable super cannot be referenced from a static context
		//System.out.println(super.d); error: non-static variable super cannot be referenced from a static context
		System.out.println(A.d);
		A.m2();
		
	}
}

