class TestAB2{
	public static void main(String [] args){
		B b = new B();
		
		System.out.println("x:"+b.x);
		System.out.println("y:"+b.y);
	}
}

class A{
	int x=m1();
	static int m1(){
		System.out.println("A m1");
		return 50;
	}
}

class B extends A{
	int y=m1();
	static int m1(){
		System.out.println("B m1");
		return 60;
	}
}



/*



*/