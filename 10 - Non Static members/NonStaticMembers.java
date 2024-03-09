class NonStaticMembers{
	int a=10;
	int b=20;
	// NonStaticMembers N4 = new NonStaticMembers(); -- NO CE but RE -  Exception in thread "main" java.lang.StackOverflowError 
	
	NonStaticMembers N4;
	static{
		System.out.println("Going inside 1st static block !!");
		NonStaticMembers N5 = new NonStaticMembers();
		System.out.println("Going out of 1st static block !!");
	}
	
	static NonStaticMembers N5 = new NonStaticMembers();
	
	{
		//System.out.println("Going Inside 1st Non-Static block !!");
		System.out.println("Inside 1st Non-Static block a -" + a);
		System.out.println("Inside 1st Non-Static block b -" + b);
		//System.out.println("Inside 1st Non-Static block c -" + c); -- error: illegal forward reference
		
		//NonStaticMembers N5 = new NonStaticMembers(); // Exception in thread "main" java.lang.StackOverflowError
		
		//System.out.println("Going out of 1st Non-Static block !!");
		
	}

	int c;

	{
		System.out.println("Inside 2nd Non-Static block !!");
		System.out.println("Inside 2nd Non-Static block c -" + c);
	}
	
	public static void main(String [] args){
		NonStaticMembers N1 = new NonStaticMembers();
		System.out.println(N1.a);
		System.out.println(N1.b);
		System.out.println(N1.c);
		System.out.println(N1.N4);
		N1.selfObjectMemberInit();
		System.out.println(N1.N4);
		System.out.println(N1);
		System.out.println("===================================================");
		
		NonStaticMembers N2 = new NonStaticMembers(111,222,333);
		System.out.println(N2.a);
		System.out.println(N2.b);
		System.out.println(N2.c);	
		System.out.println(N2.N4);
		//N2.selfObjectMemberInit();
		System.out.println(N2.N4);
		System.out.println(N2);
		System.out.println("===================================================\n");
		
		
		N2.recursiveMethod();
		
		NonStaticMembers.recursiveStaticMethod();
		
		System.out.println("===================================================\n");
		
		System.out.println(N5);
		System.out.println(N2.N5);
		System.out.println(NonStaticMembers.N5);
		
		System.out.println("===================================================\n");
		NonStaticMembers N6=null;
		System.out.println("N3 - "+ N6);
		N6.recursiveStaticMethod(); //error: variable N3 might not have been initialized
		
		NonStaticMembers N3; 
		//System.out.println("N3 - "+ N3); //  error: variable N3 might not have been initialized - as N3 is local variable, we have to initialized it before its use.
		// N3.recursiveStaticMethod(); // error: variable N3 might not have been initialized  - Null referenced variable
		
	}

	NonStaticMembers()
	{
		this(11,22,33); // this should be the first statement in constructor
		System.out.println("Inside no args constructor !!");
		//this(11,22,33); -- error: call to this must be first statement in constructor
	}
	
	NonStaticMembers(int a, int b, int c)
	{
		//this(); -- error: recursive constructor invocation
		System.out.println("Inside parameterized constructor !!");
		this.a=a;
		this.b=b;
		this.c=c;
		// this.N4= new NonStaticMembers(); -- Exception in thread "main" java.lang.StackOverflowError - This is because each instance of NonStaticMembers class attempts to create another instance within its constructor, leading to an infinite recursion and a stack overflow. To avoid this issue, you should be cautious when creating an instance of the same class within its constructor. If not handled properly, it can result in a recursive loop, eventually causing a StackOverflowError.
	}
	
	{
		System.out.println("Inside 3rd Non-Static block !!");
		//N4= new NonStaticMembers();  -  Exception in thread "main" java.lang.StackOverflowError
		// NSB inside NSB
		{
			System.out.println("Inside 3rd Non-Static block - inner Non static block !!");
		}
	}
	
	void selfObjectMemberInit(){
		this.N4= new NonStaticMembers(); // This is allowed
		System.out.println("Inside selfObjectMemberInit() !!");
		System.out.println(this);
	}
	
	void recursiveMethod(){
		System.out.println("Inside recursiveMethod() !!");
		// recursiveMethod(); // Exception in thread "main" java.lang.StackOverflowError
	}

	static void recursiveStaticMethod(){
		System.out.println("Inside recursiveStaticMethod() !!");
		//recursiveStaticMethod(); // Exception in thread "main" java.lang.StackOverflowError
	}
	
	static{
		System.out.println("Going inside 2st static block !!");
		NonStaticMembers N5 = new NonStaticMembers();
		System.out.println("Going out of 2st static block !!");
	}

}


/*

D:\Final Interview\Core java\Coding practice\10 - Non Static members>java NonStaticMembers.java
Going inside 1st static block !!
Inside 1st Non-Static block a -10
Inside 1st Non-Static block b -20
Inside 2nd Non-Static block !!
Inside 2nd Non-Static block c -0
Inside 3rd Non-Static block !!
Inside 3rd Non-Static block - inner Non static block !!
Inside parameterized constructor !!
Inside no args constructor !!
Going out of 1st static block !!
Inside 1st Non-Static block a -10
Inside 1st Non-Static block b -20
Inside 2nd Non-Static block !!
Inside 2nd Non-Static block c -0
Inside 3rd Non-Static block !!
Inside 3rd Non-Static block - inner Non static block !!
Inside parameterized constructor !!
Inside no args constructor !!
Going inside 2st static block !!
Inside 1st Non-Static block a -10
Inside 1st Non-Static block b -20
Inside 2nd Non-Static block !!
Inside 2nd Non-Static block c -0
Inside 3rd Non-Static block !!
Inside 3rd Non-Static block - inner Non static block !!
Inside parameterized constructor !!
Inside no args constructor !!
Going out of 2st static block !!
Inside 1st Non-Static block a -10
Inside 1st Non-Static block b -20
Inside 2nd Non-Static block !!
Inside 2nd Non-Static block c -0
Inside 3rd Non-Static block !!
Inside 3rd Non-Static block - inner Non static block !!
Inside parameterized constructor !!
Inside no args constructor !!
11
22
33
null
Inside 1st Non-Static block a -10
Inside 1st Non-Static block b -20
Inside 2nd Non-Static block !!
Inside 2nd Non-Static block c -0
Inside 3rd Non-Static block !!
Inside 3rd Non-Static block - inner Non static block !!
Inside parameterized constructor !!
Inside no args constructor !!
Inside selfObjectMemberInit() !!
NonStaticMembers@54c562f7
NonStaticMembers@318ba8c8
NonStaticMembers@54c562f7
===================================================
Inside 1st Non-Static block a -10
Inside 1st Non-Static block b -20
Inside 2nd Non-Static block !!
Inside 2nd Non-Static block c -0
Inside 3rd Non-Static block !!
Inside 3rd Non-Static block - inner Non static block !!
Inside parameterized constructor !!
111
222
333
null
null
NonStaticMembers@6dbb137d
===================================================

Inside recursiveMethod() !!
Inside recursiveStaticMethod() !!
===================================================

NonStaticMembers@3c9d0b9d
NonStaticMembers@3c9d0b9d
NonStaticMembers@3c9d0b9d
===================================================

N3 - null
Inside recursiveStaticMethod() !!

D:\Final Interview\Core java\Coding practice\10 - Non Static members>

*/