class LambdaDemo{
	// multi arg functional interface
	interface FuncInterfcae1{
		int operation(int a, int b);
	}
	// single arg functional interface
	interface FuncInterfcae2{
		void display(int a);
	}
	// No arg functional interface
	interface FuncInterfcae3{
		void display();
	}	
	
	interface FuncInterfcae4{
		String display();
	}	
	
	public static void main(String [] args){
		System.out.println("Hello, welcome to lambda!!");
		// single arg lambda expression
		FuncInterfcae2 f21 = (p) -> System.out.println("Displaying value - "+p);
		f21.display(5);
		
		FuncInterfcae2 f22 = (q) -> System.out.println("Printing value - "+q);
		
		f22.display(10);
		
		// multi arg lambda expression
		FuncInterfcae1 f11 = (x,y) -> (x+y);
		System.out.println("Addition of values - "+f11.operation(11,22));
		
		FuncInterfcae1 f12 = (int x,int y) -> (x*y);
		System.out.println("Multiplication of values - "+f12.operation(11,22));
		
		// No arg lambda expression
		FuncInterfcae3 f31 = () -> System.out.println("\nWelcome to No-Parameter lambda expression!!");
		f31.display();
		
		// No arg lambda expression
		FuncInterfcae3 f32 = () -> {
			System.out.println("\nWelcome to block lambda expression!!");
			System.out.println("This is statement 1 !!");
			System.out.println("This is statement 2 !!");
			};
		f32.display();		
		
		FuncInterfcae3 f33 = () ->{};
		
		FuncInterfcae4 f41 = () -> "Welcome to open lambda expression!!";
		System.out.println(f41.display());
	}
}


/*

D:\Final Interview\Core java\Lambda expression\coding>java LambdaDemo.java
Hello, welcome to lambda!!
Displaying value - 5
Printing value - 10
Addition of values - 33
Multiplication of values - 242

Welcome to No-Parameter lambda expression!!

Welcome to block lambda expression!!
This is statement 1 !!
This is statement 2 !!

D:\Final Interview\Core java\Lambda expression\coding>

*/