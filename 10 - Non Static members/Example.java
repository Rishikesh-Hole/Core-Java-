class Example{
	Example(int a)
	{
		System.out.println("Inside no-arg constructor !!");
	}
	
	public static void main(String [] args){
		//Example e1 =new Example(); // error: constructor Example in class Example cannot be applied to given types;
		Example e1 =new Example(10);
	}
}

/*

D:\Final Interview\Core java\Coding practice\10 - Non Static members>java Example.java
Example.java:8: error: constructor Example in class Example cannot be applied to given types;
                Example e1 =new Example();
                            ^
  required: int
  found:    no arguments
  reason: actual and formal argument lists differ in length
1 error
error: compilation failed

D:\Final Interview\Core java\Coding practice\10 - Non Static members>java Example.java
Inside no-arg constructor !!

D:\Final Interview\Core java\Coding practice\10 - Non Static members>

*/