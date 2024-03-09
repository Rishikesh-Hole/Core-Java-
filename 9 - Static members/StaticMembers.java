class StaticMembers{
	static int staticClassLevelVar;
	static{
		System.out.println("In check Static block - staticClassLevelVar  " + staticClassLevelVar);
	}
	
	//static int staticClassLevelVar;
	
	static{
		staticClassLevelVar=10;
		int a=10;
		System.out.println("In 1st Static block");
		System.out.println("In 1st Static block , local a varibale - "+a);
		m2();
	}
	
	static void m1(){
		System.out.println("In static void m1()");
	}
	public static void main(String [] args){
		System.out.println("Inside main()");
		m4();
	}
	
	static int staticClassLevelVar2;
	
	static{
		System.out.println("In 2nd Static block");
		System.out.println("In 2nd Static block - staticClassLevelVar  " + staticClassLevelVar);
	}
	
	static void m2(){
		System.out.println("In static void m2()");
		main(new String[0]);
	}
	
	static int staticClassLevelVar3=m3();
	
	static int m3(){
		System.out.println("In static int m3()");
		return 11;
	}
	
	static{
		System.out.println("In 3rd Static block");
		/* Nesting of static block (Static inside static)not allowed. 
		static{
			System.out.println("In 3rd Static block - inner static block");
		}
		*/
		
	}	
	
	static{
		System.out.println("In 4th Static block");
		//NSB inside SB
		{
			System.out.println("In 4th Static block - inner non static block!! ");
		}
	}
	
	static void m4(){
		System.out.println("In static void m4()");
	}
}

/*
Error because of line 7 - 
D:\Final Interview\Core java\Coding practice\9 - Static members>java StaticMembers.java
StaticMembers.java:4: error: illegal forward reference
                System.out.println("In check Static block - staticClassLevelVar  " + staticClassLevelVar);
                                                                                     ^
1 error
error: compilation failed

D:\Final Interview\Core java\Coding practice\9 - Static members>

*/

/* D:\Final Interview\Core java\Coding practice\9 - Static members>java StaticMembers.java
In check Static block - staticClassLevelVar  0
In 1st Static block
In 1st Static block , local a varibale - 10
In static void m2()
Inside main()
In static void m4()
In 2nd Static block
In 2nd Static block - staticClassLevelVar  10
In static int m3()
In 3rd Static block
Inside main()
In static void m4()

D:\Final Interview\Core java\Coding practice\9 - Static members>

*/