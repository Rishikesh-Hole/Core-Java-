// Constructor chaining + super() + this()

class SuperTest extends B{
	void m3(){
		System.out.println("Inside C class - m3() ");
		super.m1();
		super.m2();
	}
	
	public static void main(String [] args){
		System.out.println("Inside main method ");
		SuperTest S1 = new SuperTest();
		//S1.m3();
		System.out.println(S1.a);
		System.out.println(S1.b);
		System.out.println(S1.c);
		System.out.println(S1.d);
		S1.d=44;
		System.out.println(S1.d);
		
	}
}

class B extends A{
	int c;
	int b;
	
	B(){
		this(20,20);
		c=20;
		b=20;
		
	}
	B(int c, int b){
		super(c+1,b+1);
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
		System.out.println(A.d);
		A.m2();
		
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
		this.d=45;
	}
	
	void m1(){
		System.out.println("Inside A class - m1() ");
	}
	static void m2(){
		System.out.println("Inside A class - static m2() ");
	}
}


