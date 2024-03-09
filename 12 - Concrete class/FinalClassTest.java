//class FinalClassTest extends FinalMethodTest{  //  error: cannot inherit from final FinalMethodTest
class FinalClassTest extends FinalMethodTest{
		public static void main(String [] args){
		System.out.println("Inside main !!");
		FinalMethodTest T1 = new FinalMethodTest();
		
		System.out.println("=========================");
		FinalMethodTest T2 = new FinalMethodTest(10);
		T2.nonStaticMethod();
		T2.staticMethod();
		T2.display();
		// T2.display(10); error: method display in class FinalMethodTest cannot be applied to given types;
		
		System.out.println("=========================");
		FinalMethodTest T3 = new FinalClassTest();
		T3.nonStaticMethod();
		T3.staticMethod();
		T3.display();
		// T3.display(10);

	}
	
	void display(){
		System.out.println("Inside FinalClassTest - display()");
	}	
	
	void display(int a){
		System.out.println("Inside FinalClassTest - display(int a)");
	}	
}

class FinalMethodTest{
	int a;
	final int b;
	final int e;
	final static int c =10;
	final static int d=20;
	FinalMethodTest(){
		System.out.println("Inside no-arg constructor !!");
		b=20; // if we declare a non-static class variable 
		//d=20; // error: cannot assign a value to static final variable d 
	}
	//final FinalMethodTest(int a){ // error: modifier final not allowed here
	FinalMethodTest(int a){
		System.out.println("Inside arg constructor !!");
		this.a = a;
		this.b = a*2;
		// this.c = this.c + 1; // error: cannot assign a value to static final variable c
	} 
	final void nonStaticMethod(){
		System.out.println("Inside nonStaticMethod !!");
		System.out.println("Inside nonStaticMethod - this.a " + this.a);
		System.out.println("Inside nonStaticMethod - this.b " + this.b);
		System.out.println("Inside nonStaticMethod - this.c " + this.c);
		System.out.println("Inside nonStaticMethod - this.d " + this.d);
		System.out.println("Inside nonStaticMethod - this.e " + this.e);
		//FinalMethodTest.d=20;  // error: cannot assign a value to static final variable d
		// this.e=30;  error: cannot assign a value to final variable e
	}
	final static void staticMethod(){
		System.out.println("Inside staticMethod !!");
		//FinalMethodTest.d=20; // error: cannot assign a value to static final variable d
	}
	/* final { // error: illegal start of type
		
	} */
	
	/* final static{  // error: illegal start of type
		
	} */
	
	/*static {
		FinalMethodTest.d=20;  -- error: cannot assign a value to static final variable d
	}
	*/
	
	{
		e=30;
	}
	
	void display(){
		System.out.println("Inside FinalMethodTest - display()");
	}
	

}



/*

D:\Final Interview\Core java\Coding practice\12 - Concrete class>java FinalClassTest.java
Inside main !!
Inside no-arg constructor !!
=========================
Inside arg constructor !!
Inside nonStaticMethod !!
Inside nonStaticMethod - this.a 10
Inside nonStaticMethod - this.b 20
Inside nonStaticMethod - this.c 10
Inside nonStaticMethod - this.d 20
Inside nonStaticMethod - this.e 30
Inside staticMethod !!
Inside FinalMethodTest - display()
=========================
Inside no-arg constructor !!
Inside nonStaticMethod !!
Inside nonStaticMethod - this.a 0
Inside nonStaticMethod - this.b 20
Inside nonStaticMethod - this.c 10
Inside nonStaticMethod - this.d 20
Inside nonStaticMethod - this.e 30
Inside staticMethod !!
Inside FinalClassTest - display()

D:\Final Interview\Core java\Coding practice\12 - Concrete class>


*/