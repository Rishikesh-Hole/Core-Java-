class C {
	public static void main(String [] args){
		B b = new B();
		b.m1("a");
		b.m1(10);
		
		System.out.println("----------------\n");
		
		A a = new B();
		a.m1("a");
		//a.m1(10);  error: method m1 in class A cannot be applied to given types;
	}
}

class A{
	void m1(String s){
		System.out.println("A- m1()");
	}
}

class B extends A{
	void m1(Object s){
		System.out.println("B- m1()");
	}
}



/*

D:\Final Interview\Core java\Coding practice\12 - Concrete class>java C.java
A- m1()
B- m1()
----------------

A- m1()


*/