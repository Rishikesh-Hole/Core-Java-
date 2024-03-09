// overriding default method in sub interface
class TestAB implements B{
	public static void main(String [] args){
		System.out.println("inside main!!");
		TestAB T = new TestAB();
		AT.m1();
	}
	
}

interface A{
	default void m1(){
		System.out.println("inside A!!");
		
	}
}

interface B extends A{
	default void m1(){
		System.out.println("inside B!!");
	}
}
