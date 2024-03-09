class A{
	static void m1()
	{
		System.out.println("In A class - m1()");
		m2();
	}
	
	static void m2()
	{
		System.out.println("In A class - m2()");
	}
	
	void m3()
	{
		System.out.println("In A class - m2()");
		m1();
	}
	public static void main(String[] args)
	{
		System.out.println("In main");
		m1();
		//m3();
		A a1 = new A();
		a1.m3();
	}
}



/*


D:\Final Interview\Core java\Coding practice\1 - Intro to java>java StaticNonStatic.java
In main
In A class - m1()
In A class - m2()

D:\Final Interview\Core java\Coding practice\1 - Intro to java>
D:\Final Interview\Core java\Coding practice\1 - Intro to java>


## adding m3() at 22

D:\Final Interview\Core java\Coding practice\1 - Intro to java>java StaticNonStatic.java
StaticNonStatic.java:21: error: non-static method m3() cannot be referenced from a static context
                m3();
                ^
1 error
error: compilation failed

D:\Final Interview\Core java\Coding practice\1 - Intro to java>

## Calling via object
D:\Final Interview\Core java\Coding practice\1 - Intro to java>java StaticNonStatic.java
In main
In A class - m1()
In A class - m2()
In A class - m2()
In A class - m1()
In A class - m2()

D:\Final Interview\Core java\Coding practice\1 - Intro to java>
D:\Final Interview\Core java\Coding practice\1 - Intro to java>

*/