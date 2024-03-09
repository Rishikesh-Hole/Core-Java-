class OuterClass{
	int a=10;
	static int b=20;
	private int c=30;
	
	static void outerM1Static(){
		System.out.println("Inside OuterClass - static void outerM1Static() !! ");
	}
	
	void outerM1(){
		System.out.println("Inside OuterClass - void outerM1() !! ");
	}
		static class InnerStaticClass{
			int x;
			static int y;
			private int z;
			
			InnerStaticClass(){
				this(100,200,300);
			}
			
			InnerStaticClass(int x, int y, int z){
				this.x=x;
				this.y=y;
				this.z=z;
			}
			
			void innerM1(){
				System.out.println("\nInside InnerStaticClass - void innerM1() !! ");
				System.out.println("Inside InnerStaticClass void innerM1() - Accessing outer class members - ");
				//System.out.println("a - "+ a); error: non-static variable a cannot be referenced from a static context
				System.out.println("b - "+ b); // outer class non static members can not be access directly. Static can be.
				//System.out.println("c - "+ c); error: non-static variable a cannot be referenced from a static context
			}
			
			static void innerM1Static(){
				System.out.println("Inside InnerStaticClass - static void innerM1Static() !! ");
				//System.out.println("a - "+ a); error: non-static variable a cannot be referenced from a static context
				System.out.println("b - "+ b);
				//System.out.println("c - "+ c);error: non-static variable a cannot be referenced from a static context		
			}
			
			public static void main(String [] args){
				System.out.println("Inside InnerStaticClass - main method !! ");
				
				System.out.println("Accessing outer class members from inner class - ");
				OuterClass OC1 = new OuterClass();
				System.out.println("a - "+ OC1.a);
				System.out.println("b - "+ b); 
				System.out.println("c - "+ OC1.c);
				outerM1Static();
				OC1.outerM1();
				//OC1.innerM1();  error: cannot find symbol
				//OC1.innerM1Static();  error: cannot find symbol
				//main(new String[0]);  // inner class main method call - error Exception in thread "main" java.lang.StackOverflowError
				OuterClass.main(new String[0]); // outer class main method call
				
				System.out.println("\nAccessing inner class members from inner class - ");
				System.out.println("\n Its similar to regular concrete class !! ");
				innerM1Static(); // is equal to - InnerStaticClass.innerM1Static();
				InnerStaticClass IC1 = new InnerStaticClass();
				IC1.innerM1();
				System.out.println("x - "+ IC1.x);
				System.out.println("y - "+ y);
				System.out.println("z - "+ IC1.z);
				
			}
		}
	
	public static void main(String [] args){
		System.out.println("Inside OuterStaticClass - main method !! ");
		System.out.println("\nAccessing inner class members from outer class - ");
		OuterClass OC1 = new OuterClass();
		//OC1.innerM1(); -- error
		//OC1.innerM1Static(); -- error
		InnerStaticClass.innerM1Static();
		
		InnerStaticClass IC1 = new InnerStaticClass();
		IC1.innerM1();
		
		
		
	}
	
}

/*

D:\Final Interview\Core java\Coding practice\15 - inner classes>java OuterClass$InnerStaticClass
Inside InnerStaticClass - main method !!
Accessing outer class members from inner class -
a - 10
b - 20
c - 30
Inside OuterClass - static void outerM1Static() !!
Inside OuterClass - void outerM1() !!
Inside OuterStaticClass - main method !!

Accessing inner class members from inner class -
Inside InnerStaticClass - static void innerM1Static() !!
b - 20

Inside InnerStaticClass - void innerM1() !!
Inside InnerStaticClass void innerM1() - Accessing outer class members -
b - 20

Accessing inner class members from inner class -

 Its similar to regular concrete class !!
Inside InnerStaticClass - static void innerM1Static() !!
b - 20

Inside InnerStaticClass - void innerM1() !!
Inside InnerStaticClass void innerM1() - Accessing outer class members -
b - 20
x - 100
y - 200
z - 300

D:\Final Interview\Core java\Coding practice\15 - inner classes>

*/