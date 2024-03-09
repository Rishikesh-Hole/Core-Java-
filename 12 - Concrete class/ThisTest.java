class ThisTest{
	int a;
	int b;
	static int c;
	ThisTest(){
		System.out.println("Inside no-arg constructor !!");
	}
	ThisTest(int a){
		System.out.println("Inside arg constructor !!");
		this.a = a;
		this.b = a*2;
		this.c = this.c + 1;
	}
	void nonStaticMethod(){
		System.out.println("Inside nonStaticMethod !!");
		System.out.println("Inside nonStaticMethod - this.a " + this.a);
		System.out.println("Inside nonStaticMethod - this.a " + this.b);
		System.out.println("Inside nonStaticMethod - this.a " + this.c);
	}
	static void staticMethod(){
		System.out.println("Inside staticMethod !!");
		// System.out.println(" Inside staticMethod - this.a " + this.a); // error: non-static variable this cannot be referenced from a static context
	}
	{
		System.out.println("Inside non static block !!");
		System.out.println("Inside non static block - this.a " + this.a);
	}
	
	static{
		System.out.println("Inside static block !!");
		// System.out.println(" Inside  static block - this.a " + this.a); error: non-static variable this cannot be referenced from a static context
	}
	
	public static void main(String [] args){
		System.out.println("Inside main !!");
		ThisTest T1 = new ThisTest();
		
		System.out.println("=========================");
		ThisTest T2 = new ThisTest(10);
		
		System.out.println("=========================");
		T2.nonStaticMethod();
		T2.staticMethod();
	}
}



/*

D:\Final Interview\Core java\Coding practice\12 - Concrete class>java ThisTest.java
Inside static block !!
Inside main !!
Inside non static block !!
Inside non static block - this.a 0
Inside no-arg constructor !!
=========================
Inside non static block !!
Inside non static block - this.a 0
Inside arg constructor !!
=========================
Inside nonStaticMethod !!
Inside nonStaticMethod - this.a 10
Inside nonStaticMethod - this.a 20
Inside nonStaticMethod - this.a 1
Inside staticMethod !!

D:\Final Interview\Core java\Coding practice\12 - Concrete class>


*/