class NaNTest{
	public static void main(String [] args)
	{
		double result1 = 5.0/0.0;
		double result2 = Math.sqrt(-1); 
		
		System.out.println("Result 1:" + result2);
		System.out.println("Result 2:" + result2);
		
		System.out.println("Checking NaN resulf of result1 " + Double.isNaN(result1));
		System.out.println("Checking NaN resulf of result2 " + Double.isNaN(result2));
		
		/* int intNumber = 1;
		int result3 = intNumber / 0;  
		System.out.println("Result 3:" + result3);
		
		O/P (if added above three statements ): 
		Result 1:Infinity
		Result 2:NaN
		Checking NaN resulf of result1 false
		Checking NaN resulf of result2 true
		Exception in thread "main" java.lang.ArithmeticException: / by zero
        at NaNTest.main(NaNTest.java:14)
		
		*/
		
		System.out.println("Infinity -  Infinity i.e. result1- result1 : " + (result1 - result1));
	}
}



/*

D:\Final Interview\Core java\Coding practice\2 - Indentfiers and keywords>java NaNTest.java
Result 1:Infinity
Result 2:NaN
Checking NaN resulf of result1 false
Checking NaN resulf of result2 true

D:\Final Interview\Core java\Coding practice\2 - Indentfiers and keywords>




D:\Final Interview\Core java\Coding practice\2 - Indentfiers and keywords>java NaNTest.java
Result 1:NaN
Result 2:NaN
Checking NaN resulf of result1 false
Checking NaN resulf of result2 true
Infinity -  Infinity i.e. result1- result1 : NaN

D:\Final Interview\Core java\Coding practice\2 - Indentfiers and keywords>

*/