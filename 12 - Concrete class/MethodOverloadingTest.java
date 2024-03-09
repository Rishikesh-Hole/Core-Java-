class MethodOverloadingTest{
	void m1(){
		System.out.println("inside void m1()");
	}
	
	/*void m1(int a){
		System.out.println("inside void m1(int a)");
	}*/
	
	int m1(int a){
		System.out.println("inside int m1(int a)");
		return a*2;
	}
	
	/*private float m1(int a){ //error: method m1(int) is already defined in class MethodOverloadingTest
		System.out.println("inside float m1(int a)");
		return a*2;
	}*/
	
	//below 2 methods will lead to ambigity
	float m1(float a, int b){ //error: reference to m1 is ambiguous
		System.out.println("inside float m1(float a, int b)");
		return a*b;
	}
	
	/*float m1(int a, float b){ //error: reference to m1 is ambiguous 
		System.out.println("inside float m1(float a, int b)");
		return a*b;
	}	*/
	
	float m1(int a, int b){ 
		System.out.println("inside float m1(int a, int b)");
		return a*b;
	}
	
	float m1(Float a, Float b){ 
		System.out.println("inside float m1(Float a, Float b)");
		return a*b;
	}	
	
	/*float m1(Integer a, Double b, Integer c){ 
		System.out.println("inside float m1(Integer a, Integer b, Integer c)");
		return a*b*c; // error: incompatible types: possible lossy conversion from double to float
	}	*/
	
	float m1(Integer a, Integer b, int c){ //error: reference to m1 is ambiguous
		System.out.println("inside float m1(Integer a, Integer b, int c)");
		return a*b*c; 
	}
	
	float m1(Integer ... a){ 
		System.out.println("inside float m1(Integer ... a)");
		return 1111;
	}
	
	void m1(Object ... a){ 
		System.out.println("inside void m1(Object ... a)");
		
	}
	
	void m1(String a, String b, String c){ 
		System.out.println("inside void m1(String a, String b, String c)");
		
	}
	
	void m2(Integer A){ 
		System.out.println("inside void m2(Integer A) ");
		
	}
	
	void m2(Long A){ 
		System.out.println("inside void m2(Long A) ");
		
	}
	
	void m3(Float A){ 
		System.out.println("inside void m3(Float A) ");
		
	}
	
	void m3(Double A){ 
		System.out.println("inside void m3(Double A) ");
		
	}
	
	void m3(Object A){ 
		System.out.println("inside void m3(Object A) ");
		
	}
	
	public static void main(String [] args){
		MethodOverloadingTest M = new MethodOverloadingTest();
		
		M.m1();
		M.m1(10);
		System.out.println(M.m1(10));
		//System.out.println(M.m1(10,20)); //error: reference to m1 is ambiguous
		System.out.println(M.m1(10,20));
		//System.out.println(M.m1(10.1,20.1)); error: no suitable method found for m1(double,double)
		//System.out.println(M.m1((Float)10.1,(Float)20.1)); // error: incompatible types: double cannot be converted to Float
		System.out.println(M.m1((Float)10.1F,(Float)20.1F));
		
		System.out.println(M.m1(10,20,30)); // error: no suitable method found for m1(int,int,int)
		System.out.println(M.m1(10,20,30,40));
		M.m1("a","b","c");
		M.m1("a","b","c","d");
		
		M.m2(101);
		M.m2(101L);
		//M.m2(null); // error: reference to m2 is ambiguous because method is overloaded with Integer and Long which are siblings to each other
		
		M.m3(102);
		M.m3(102.0);
		//M.m3(null);   // error: reference to m3 is ambiguous - m3 is ambiguous because method is overloaded with Integer and Long (which are siblings to each other) + parent class
	}
}

/*

D:\Final Interview\Core java\Coding practice\12 - Concrete class>java MethodOverloadingTest.java
inside void m1()
inside int m1(int a)
inside int m1(int a)
20
inside float m1(int a, int b)
200.0
inside float m1(Float a, Float b)
203.01001
inside float m1(Integer a, Integer b, int c)
6000.0
inside float m1(Integer ... a)
1111.0
inside void m1(String a, String b, String c)
inside void m1(Object ... a)
inside void m2(Integer A)
inside void m2(Long A)
inside void m3(Object A)
inside void m3(Double A)

D:\Final Interview\Core java\Coding practice\12 - Concrete class>



*/