//class ConcreteClass extends AbstractClassTest3{  // error: ConcreteClass is not abstract and does not override abstract method m3() in AbstractClassTest3 - must override abstarct method
class ConcreteClass extends AbstractClassTest3{
		void m3(){
			System.out.println("Inside ConcreteClass - void m3() !!");
		}
		
		public static void main(String [] args){
			System.out.println("Inside ConcreteClass - main method !!");
			ConcreteClass C1 = new ConcreteClass();
			C1.m1();
			C1.m2();
			C1.m4();
			C1.m3();
		}
}


abstract class AbstractClassTest3 extends ConcreateClass  implements Interface1 {  	
	
	static int a;
	final int b;
	int c;
	{
		System.out.println("Inside AbstractClassTest2 - non static block !!");
	}
	
	static {
		System.out.println("Inside AbstractClassTest2 - static block !!");
	}
	
	static void m1(){
		System.out.println("Inside AbstractClassTest2 - static void m1() !!");
	}
	
	void m2(){
		System.out.println("Inside AbstractClassTest2 - void m2() !!");
	}
	
	AbstractClassTest3(){
		a=10;
		b=20;
		c=30;
	}
	
	abstract void m3();
	
	// abstract void m4(){  --abstract keyword is not allowed with concrete method
	void m4(){
		System.out.println("Inside AbstractClassTest2 - void m4() !!");
	}
	
	public static void main(String [] args){ // main is allowed inside abstract class
		System.out.println("Inside AbstractClassTest2 - main method !!");
	}
	
}

interface Interface1{
	
}

class ConcreateClass{
	
}