class methodTest{
	Integer add(int a, int b){
		return a+b;
	}
	
	float sub(int a, float b){
		return a-b;
	}
	
	int mult(Integer a, Integer b){
		return a+b;
	}
	
	public static void main(String [] a)
	{
		int add_res = (new methodTest()).add(10,20);
		// int sub_res = (new methodTest()).sub(10,20); incompatible types: possible lossy conversion from float to int
		float sub_res = (new methodTest()).sub(10,20);
		int mult_res = (new methodTest()).mult(10,20);
		
		System.out.println("Addition result - " + add_res);
		System.out.println("Subtraction result"+ sub_res);
		System.out.println("Multiplication result"+mult_res);
		
	    Integer add_res1 = (new methodTest()).add(10,20);
		Float sub_res1 = (new methodTest()).sub(10,20);
		Integer mult_res1 = (new methodTest()).mult(10,20);
	
		System.out.println("Addition result - " + add_res1);
		System.out.println("Subtraction result"+ sub_res1);
		System.out.println("Multiplication result"+mult_res1);
		
		System.out.println((new methodTest()).add(Integer.valueOf(11),Integer.valueOf(12)));
	}
}


/*

D:\Final Interview\Core java\Coding practice\5 -Wrapper classes>java methodTest.java
Addition result - 30
Subtraction result-10.0
Multiplication result30
Addition result - 30
Subtraction result-10.0
Multiplication result30
23

D:\Final Interview\Core java\Coding practice\5 -Wrapper classes>

*/