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
	
	public static void main(String [] args){
		System.out.println("Inside main !!");
		FinalMethodTest T1 = new FinalMethodTest();
		
		System.out.println("=========================");
		FinalMethodTest T2 = new FinalMethodTest(10);
		
		System.out.println("=========================");
		T2.nonStaticMethod();
		T2.staticMethod();
		
		//FinalMethodTest.d=20; error: cannot assign a value to static final variable d
	}
}



/*




*/