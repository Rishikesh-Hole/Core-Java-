class TestAB{
	public static void main(String [] args){
		B b = new B();
		
		System.out.println("x:"+b.x);
		System.out.println("y:"+b.y);
	}
}

class A{
	int x=m1();
	int m1(){
		System.out.println("A m1");
		return 50;
	}
}

class B extends A{
	int y=m1();
	int m1(){
		System.out.println("B m1");
		return 60;
	}
}



/*

D:\Final Interview\Core java\Coding practice\12 - Concrete class>java TestAB.java
B m1
B m1
x:60
y:60

D:\Final Interview\Core java\Coding practice\12 - Concrete class>

*/