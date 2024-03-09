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
		class InnerNonStaticClass{
			int x;
			static int y;
			private int z;
			
			InnerNonStaticClass(){
				this(100,200,300);
			}
			
			InnerNonStaticClass(int x, int y, int z){
				this.x=x;
				this.y=y;
				this.z=z;
			}
			
			void innerM1(){
				System.out.println("\nInside InnerNonStaticClass - void innerM1() !! ");
				System.out.println("Inside InnerNonStaticClass void innerM1() - Accessing outer class members - ");
				System.out.println("a - "+ a); // we can access static and non-static members of outer class directly from non-static context of inner class
				System.out.println("b - "+ b);
				System.out.println("c - "+ c); 
			}
			
			static void innerM1Static(){
				System.out.println("Inside InnerNonStaticClass - static void innerM1Static() !! ");
				//System.out.println("a - "+ a); error: non-static variable a cannot be referenced from a static context
				System.out.println("b - "+ b);
				//System.out.println("c - "+ c);error: non-static variable a cannot be referenced from a static context		
			}
			
			public static void main(String [] args){
				System.out.println("Inside InnerNonStaticClass - main method !! ");
				System.out.println("Accessing outer class members from inner non static class - ");
				
				OuterClass OC1 = new OuterClass();
				System.out.println("a - "+ OC1.a);
				System.out.println("b - "+ b);  // we can access static members of outer class directly from static context
				System.out.println("c - "+ OC1.c); // we need an instance of outer class to access non-static members of outer class from static context of inner class
				outerM1Static();
				
				
			}
		}
	
	public static void main(String [] args){
		System.out.println("Inside Outer Class - main method !! ");
		System.out.println("\nAccessing inner non-static class members from outer class - ");
		
		
		//InnerNonStaticClass IC1 = new InnerNonStaticClass(); we must create out class object to create non static inner clas object
		OuterClass.InnerNonStaticClass IC1 = new OuterClass().new InnerNonStaticClass();
		IC1.innerM1();
		InnerNonStaticClass.innerM1Static(); // Static members of inner non-static class can be accessed using inner class name.
		System.out.println("InnerNonStaticClass.y - " + InnerNonStaticClass.y);
		
		
		
	}
	
}

/*

D:\Final Interview\Core java\Coding practice\15 - inner classes>java InnerNonStaticClass.java
Inside Outer Class - main method !!

Accessing inner non-static class members from outer class -

Inside InnerNonStaticClass - void innerM1() !!
Inside InnerNonStaticClass void innerM1() - Accessing outer class members -
a - 10
b - 20
c - 30
Inside InnerNonStaticClass - static void innerM1Static() !!
b - 20
InnerNonStaticClass.y - 200

D:\Final Interview\Core java\Coding practice\15 - inner classes>

*/


/*

D:\Final Interview\Core java\Coding practice\15 - inner classes>javac InnerNonStaticClass.java

D:\Final Interview\Core java\Coding practice\15 - inner classes>
D:\Final Interview\Core java\Coding practice\15 - inner classes>java OuterClass
Inside Outer Class - main method !!

Accessing inner non-static class members from outer class -

Inside InnerNonStaticClass - void innerM1() !!
Inside InnerNonStaticClass void innerM1() - Accessing outer class members -
a - 10
b - 20
c - 30
Inside InnerNonStaticClass - static void innerM1Static() !!
b - 20
InnerNonStaticClass.y - 200

D:\Final Interview\Core java\Coding practice\15 - inner classes>java OuterClass$InnerNonStaticClass
Inside InnerNonStaticClass - main method !!
Accessing outer class members from inner non static class -
a - 10
b - 20
c - 30
Inside OuterClass - static void outerM1Static() !!

D:\Final Interview\Core java\Coding practice\15 - inner classes>

*/