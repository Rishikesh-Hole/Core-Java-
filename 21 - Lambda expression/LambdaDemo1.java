class LambdaDemo1{
	// multi arg functional interface
	interface FuncInterface1{
		void display();
	}
	
	interface FuncInterface2{
		void display(int a, int b);
	}	
	
	static void fun(FuncInterface1 F){
		F.display();
	}
	
	static void fun(FuncInterface1 F, int a){
		F.display();
		System.out.println("Inside fun method - Value of a: "+a);
	}
	
	static void fun(FuncInterface2 F, int a, int b){
		System.out.println("Inside fun method - Start");
		F.display(a,b);
		System.out.println("Inside fun method - End");
	}	
	
	public static void main(String [] args){
		System.out.println("Hello, welcome to lambda demo!!");
		
		fun(()->System.out.println("Paasing lambda expression as argument"));
		
		fun(()->{System.out.println("\nPaasing lambda expression as argument");
				System.out.println("Paasing lambda block as argument");
				System.out.println("Paasing lambda block as argument");});
		
		System.out.println();		
		fun(()->System.out.println("Paasing lambda expression as argument - Multiple arguments"), 10);
		
		System.out.println();
		
		fun((p,q)->System.out.println("Paasing lambda expression as argument - Multiple arguments"), 10,20);
		
		System.out.println();
		
		fun((p,q)->{System.out.println("Paasing lambda expression as argument - Multiple arguments");System.out.println("q: "+q);System.out.println("p: "+p);}, 10,20);
		
	}
}

/*

D:\Final Interview\Core java\Lambda expression\coding>java LambdaDemo1.java
Hello, welcome to lambda demo!!
Paasing lambda expression as argument

Paasing lambda expression as argument
Paasing lambda block as argument
Paasing lambda block as argument

D:\Final Interview\Core java\Lambda expression\coding>

*/