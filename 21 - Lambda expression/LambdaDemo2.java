// varibale capturing 
class LambdaDemo2{
interface interface1{
	int mathops(int a, int b);
}	
public static void main(String [] args){
	int a = 10;
	
	interface1 I1 = (x,y)-> x+y;
	
	System.out.println(I1.mathops(10,20));
	
	interface1 I2 = (x,y)-> {System.out.println("Adding a with X and Y."); return a+x+y;};
	
	System.out.println(I2.mathops(10,20));
	
	//a=20; // error: local variables referenced from a lambda expression must be final or effectively final
}
}

/*

D:\Final Interview\Core java\Lambda expression\coding>java LambdaDemo2.java
30
Adding a with X and Y.
40

D:\Final Interview\Core java\Lambda expression\coding>

*/