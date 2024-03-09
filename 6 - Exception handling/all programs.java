class excpetionTest1{
	public static void main(String [] args){
		try{
			int a=10;
			int b=a/0;
		}
		finally
		{
			System.out.println("In finally Block");
			
		}
	}
}

/*

D:\Final Interview\Core java\Coding practice\6 - Exception handling>java excpetionTest1.java
In finally Block
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at excpetionTest1.main(excpetionTest1.java:5)

*/



class excpetionTest1{
	public static void main(String [] args){
		try{
			int a=10;
			int b=a/0;
		}
		finally
		{
			System.out.println("In finally Block");
			return;
		}
	}
}

/*
D:\Final Interview\Core java\Coding practice\6 - Exception handling>java excpetionTest1.java
In finally Block


*/


class excpetionTest1{
	public static void main(String [] args){
		try{
			int a=10;
			int b=a/0;
			return;
		}
		finally
		{
			System.out.println("In finally Block");
			//return;
		}
	}
}

/*

D:\Final Interview\Core java\Coding practice\6 - Exception handling>java excpetionTest1.java
In finally Block
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at excpetionTest1.main(excpetionTest1.java:5)


*/



class excpetionTest1{
	public static void main(String [] args){
		try{
			int a=10;
			return;
			int b=a/0;
			return;
		}
		finally
		{
			System.out.println("In finally Block");
			//return;
		}
	}
}


/*
D:\Final Interview\Core java\Coding practice\6 - Exception handling>java excpetionTest1.java
excpetionTest1.java:6: error: unreachable statement
                        int b=a/0;
                            ^
1 error
error: compilation failed

D:\Final Interview\Core java\Coding practice\6 - Exception handling>

*/


class excpetionTest1{
	public static void main(String [] args){
		try{
			int a=10;
			int b=a/0;
			
		}
		
		catch(ArithmeticException ae)
		{
			System.out.println("====================");
			
			ae.printStackTrace();
			System.out.println("====================");
			
			System.out.println(ae.getMessage());
			System.out.println("====================");
			
			System.out.println(ae.toString());
			System.out.println("====================");
			
		}
		catch(Exception ae)
		{
			ae.printStackTrace();
			System.out.println("====================");
			
			System.out.println(ae.getMessage());
			System.out.println("====================");
			
			System.out.println(ae.toString());
			System.out.println("====================");			
		}
		finally
		{
			System.out.println("In finally Block");
			
		}
	}
}



/*

D:\Final Interview\Core java\Coding practice\6 - Exception handling>java excpetionTest1.java
====================
java.lang.ArithmeticException: / by zero
        at excpetionTest1.main(excpetionTest1.java:5)
        at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
        at java.base/java.lang.reflect.Method.invoke(Method.java:580)
        at jdk.compiler/com.sun.tools.javac.launcher.Main.execute(Main.java:484)
        at jdk.compiler/com.sun.tools.javac.launcher.Main.run(Main.java:208)
        at jdk.compiler/com.sun.tools.javac.launcher.Main.main(Main.java:135)
====================
/ by zero
====================
java.lang.ArithmeticException: / by zero
====================
In finally Block

D:\Final Interview\Core java\Coding practice\6 - Exception handling>

*/




class excpetionTest1{
	public static void main(String [] args){
		try{
			int a=10;
			int b=a/0;
			
		}
		
		catch(ArithmeticException ae)
		{
			System.out.println("====================");
			
			ae.printStackTrace();
			System.out.println("====================");
			
			System.out.println(ae.getMessage());
			System.out.println("====================");
			
			System.out.println(ae.toString());
			System.out.println("====================");
			
		}
		catch(Exception ae)
		{
			ae.printStackTrace();
			System.out.println("====================");
			
			System.out.println(ae.getMessage());
			System.out.println("====================");
			
			System.out.println(ae.toString());
			System.out.println("====================");			
		}
		catch(NumberFormatException ae)
		{
			System.out.println("====================");
			
			ae.printStackTrace();
			System.out.println("====================");
			
			System.out.println(ae.getMessage());
			System.out.println("====================");
			
			System.out.println(ae.toString());
			System.out.println("====================");
			
		}		
		finally
		{
			System.out.println("In finally Block");
			
		}
	}
}

/*


D:\Final Interview\Core java\Coding practice\6 - Exception handling>java excpetionTest1.java
excpetionTest1.java:34: error: exception NumberFormatException has already been caught
                catch(NumberFormatException ae)
                ^
1 error
error: compilation failed

D:\Final Interview\Core java\Coding practice\6 - Exception handling>


*/







class excpetionTest1{
	public static void main(String [] args){
		try{
			int a=10;
			int b=a/0;
			
		}
		
		catch(ArithmeticException ae)
		{
			System.out.println("====================");
			
			ae.printStackTrace();
			System.out.println("====================");
			
			System.out.println(ae.getMessage());
			System.out.println("====================");
			
			System.out.println(ae.toString());
			System.out.println("====================");
			
		}
		catch(Exception ae)
		{
			ae.printStackTrace();
			System.out.println("====================");
			
			System.out.println(ae.getMessage());
			System.out.println("====================");
			
			System.out.println(ae.toString());
			System.out.println("====================");			
		}		
		finally
		{
			System.out.println("In finally Block");
			
		}

		try{
			int a=10;
			int b=a/0;
			
		}
		
		catch(ArithmeticException ae)
		{
			System.out.println("====================");
			
			ae.printStackTrace();
			System.out.println("====================");
			
			System.out.println(ae.getMessage());
			System.out.println("====================");
			
			System.out.println(ae.toString());
			System.out.println("====================");
			
		}
		catch(Exception ae)
		{
			ae.printStackTrace();
			System.out.println("====================");
			
			System.out.println(ae.getMessage());
			System.out.println("====================");
			
			System.out.println(ae.toString());
			System.out.println("====================");			
		}		
		finally
		{
			System.out.println("In finally Block");
			
		}

	}
}


/*

D:\Final Interview\Core java\Coding practice\6 - Exception handling>java excpetionTest1.java
====================
java.lang.ArithmeticException: / by zero
        at excpetionTest1.main(excpetionTest1.java:5)
        at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
        at java.base/java.lang.reflect.Method.invoke(Method.java:580)
        at jdk.compiler/com.sun.tools.javac.launcher.Main.execute(Main.java:484)
        at jdk.compiler/com.sun.tools.javac.launcher.Main.run(Main.java:208)
        at jdk.compiler/com.sun.tools.javac.launcher.Main.main(Main.java:135)
====================
/ by zero
====================
java.lang.ArithmeticException: / by zero
====================
In finally Block
====================
java.lang.ArithmeticException: / by zero
        at excpetionTest1.main(excpetionTest1.java:42)
        at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
        at java.base/java.lang.reflect.Method.invoke(Method.java:580)
        at jdk.compiler/com.sun.tools.javac.launcher.Main.execute(Main.java:484)
        at jdk.compiler/com.sun.tools.javac.launcher.Main.run(Main.java:208)
        at jdk.compiler/com.sun.tools.javac.launcher.Main.main(Main.java:135)
====================
/ by zero
====================
java.lang.ArithmeticException: / by zero
====================
In finally Block

D:\Final Interview\Core java\Coding practice\6 - Exception handling>
D:\Final Interview\Core java\Coding practice\6 - Exception handling>


*/








class excpetionTest1{
	public static void main(String [] args){
		int a;
		int b;
		try{
			a=10;
			b=a/0;
			
		}
		
		catch(ArithmeticException ae)
		{
			System.out.println("====================");
			
			//ae.printStackTrace();
			System.out.println("====================");
			
			System.out.println(ae.getMessage());
			System.out.println("====================");
			
			System.out.println(ae.toString());
			System.out.println("====================");
			b=a/0;
			
		}
		catch(Exception ae)
		{
			ae.printStackTrace();
			System.out.println("====================");
			
			System.out.println(ae.getMessage());
			System.out.println("====================");
			
			System.out.println(ae.toString());
			System.out.println("====================");			
		}		
		finally
		{
			System.out.println("In finally Block");
			
		}
		
		System.out.println("After finally ");

	}
}


/*

D:\Final Interview\Core java\Coding practice\6 - Exception handling>java excpetionTest1.java
excpetionTest1.java:23: error: variable a might not have been initialized
                        b=a/0;
                          ^
1 error
error: compilation failed

D:\Final Interview\Core java\Coding practice\6 - Exception handling>

*/



class excpetionTest1{
	public static void main(String [] args){
		int a=-1;
		int b=-1;
		try{
			a=10;
			b=a/0;
			
		}
		
		catch(ArithmeticException ae)
		{
			System.out.println("====================");
			
			//ae.printStackTrace();
			System.out.println("====================");
			
			System.out.println(ae.getMessage());
			System.out.println("====================");
			
			System.out.println(ae.toString());
			System.out.println("====================");
			b=a/0;
			
		}
		catch(Exception ae)
		{
			ae.printStackTrace();
			System.out.println("====================");
			
			System.out.println(ae.getMessage());
			System.out.println("====================");
			
			System.out.println(ae.toString());
			System.out.println("====================");			
		}		
		finally
		{
			System.out.println("In finally Block");
			
		}

	}
}


/*

D:\Final Interview\Core java\Coding practice\6 - Exception handling>java excpetionTest1.java
====================
====================
/ by zero
====================
java.lang.ArithmeticException: / by zero
====================
In finally Block
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at excpetionTest1.main(excpetionTest1.java:23)

D:\Final Interview\Core java\Coding practice\6 - Exception handling>

*/




class excpetionTest1{
	public static void main(String [] args){
		int a=-1;
		int b=-1;
		
		System.out.println(add());

	}
	static int add(){
		try{
			System.out.println("In try ");
			int c=10/0;
			return 10;
		}
		
		catch(ArithmeticException ae)
		{
			System.out.println("In ArithmeticException ");
			System.out.println("====================");
			
			//ae.printStackTrace();
			System.out.println("====================");
			
			System.out.println(ae.getMessage());
			System.out.println("====================");
			
			System.out.println(ae.toString());
			System.out.println("====================");
			return 20;
			
		}
		catch(Exception ae)
		{
			//ae.printStackTrace();
			System.out.println("In Exception ");
			System.out.println("====================");
			
			System.out.println(ae.getMessage());
			System.out.println("====================");
			
			System.out.println(ae.toString());
			System.out.println("====================");		
			return 30;			
		}		
		finally
		{
			System.out.println("In finally Block");
			return 40;
			
		}

	}
}



/*

D:\Final Interview\Core java\Coding practice\6 - Exception handling>java excpetionTest1.java
In try
In ArithmeticException
====================
====================
/ by zero
====================
java.lang.ArithmeticException: / by zero
====================
In finally Block
40

D:\Final Interview\Core java\Coding practice\6 - Exception handling>

*/




class excpetionTest1{
	public static void main(String [] args){
		System.out.println(add());

	}
	static int add(){
		try{
			System.out.println("In try ");
			int c=10/0;
			
		}
		
		catch(ArithmeticException ae)
		{
			System.out.println("In ArithmeticException ");
			System.out.println("====================");
			
			//ae.printStackTrace();
			System.out.println("====================");
			
			System.out.println(ae.getMessage());
			System.out.println("====================");
			
			System.out.println(ae.toString());
			System.out.println("====================");
			return 20;
			
		}
		catch(Exception ae)
		{
			//ae.printStackTrace();
			System.out.println("In Exception ");
			System.out.println("====================");
			
			System.out.println(ae.getMessage());
			System.out.println("====================");
			
			System.out.println(ae.toString());
			System.out.println("====================");		
			return 30;			
		}		
		finally
		{
			System.out.println("In finally Block");
			return 40;
			
		}
		
		System.out.println("After finally Block");

	}
}


/*
D:\Final Interview\Core java\Coding practice\6 - Exception handling>java excpetionTest1.java
excpetionTest1.java:52: error: unreachable statement
                System.out.println("After finally Block");
                ^
1 error
error: compilation failed

D:\Final Interview\Core java\Coding practice\6 - Exception handling>

*/



class excpetionTest1{
	public static void main(String [] args){
		System.out.println(add());

	}
	static int add(){
		try{
			System.out.println("In try ");
			System.out.println(10/0);
		}
		
		catch(NullPointerException ae)
		{
			System.out.println("In NullPointerException ");
			System.out.println("====================");
			
			//ae.printStackTrace();
			System.out.println("====================");
			
			System.out.println(ae.getMessage());
			System.out.println("====================");
			
			System.out.println(ae.toString());
			System.out.println("====================");
			//return 20;
			
		}		
		finally
		{
			System.out.println("In finally Block");
			return 40;
			
		}

	}
}


/*
D:\Final Interview\Core java\Coding practice\6 - Exception handling>java excpetionTest1.java
In try
In finally Block
40

D:\Final Interview\Core java\Coding practice\6 - Exception handling>

*/




class excpetionTest1{
	public static void main(String [] args){
		add();
		System.out.println();

	}
	static void add(){
		try{
			System.out.println("In try ");
			System.out.println(10/0);
		}
		
		catch(NullPointerException ae)
		{
			System.out.println("In NullPointerException ");
			System.out.println("====================");
			
			//ae.printStackTrace();
			System.out.println("====================");
			
			System.out.println(ae.getMessage());
			System.out.println("====================");
			
			System.out.println(ae.toString());
			System.out.println("====================");
			//return 20;
			
		}		
		finally
		{
			System.out.println("In finally Block");
			return;
			
		}

	}
}

/*
D:\Final Interview\Core java\Coding practice\6 - Exception handling>java excpetionTest1.java
In try
In finally Block


D:\Final Interview\Core java\Coding practice\6 - Exception handling>
*/











class excpetionTest1{
	public static void main(String [] args){
		
		System.out.println(add());

	}
	static int add(){
		try{
			System.out.println("In try ");
			System.out.println(10/0);
		}
		
		catch(NullPointerException ae)
		{
			System.out.println("In NullPointerException ");
			System.out.println("====================");
			
			//ae.printStackTrace();
			System.out.println("====================");
			
			System.out.println(ae.getMessage());
			System.out.println("====================");
			
			System.out.println(ae.toString());
			System.out.println("====================");
			//return 20;
			
		}		
		finally
		{
			System.out.println("In finally Block");
			
			
		}
		return 20;

	}
}




/*
D:\Final Interview\Core java\Coding practice\6 - Exception handling>java excpetionTest1.java
In try
In finally Block
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at excpetionTest1.add(excpetionTest1.java:10)
        at excpetionTest1.main(excpetionTest1.java:4)

D:\Final Interview\Core java\Coding practice\6 - Exception handling>


*/

class excpetionTest1{
	public static void main(String [] args){
		
		System.out.println(add());

	}
	static int add(){
		try{
		
		try{
			System.out.println("In try ");
			System.out.println(10/0);
		}
		
		catch(NullPointerException ae)
		{
			System.out.println("In NullPointerException ");
			System.out.println("====================");
			
			//ae.printStackTrace();
			System.out.println("====================");
			
			System.out.println(ae.getMessage());
			System.out.println("====================");
			
			System.out.println(ae.toString());
			System.out.println("====================");
			//return 20;
			
		}		
		finally
		{
			System.out.println("In inner finally Block");
			
			
		}
		return 20;
		
		}
		
		finally{
			System.out.println("In outer finally Block");
			
			
		}

	}
}




/*
D:\Final Interview\Core java\Coding practice\6 - Exception handling>java excpetionTest1.java
In try
In inner finally Block
In outer finally Block
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at excpetionTest1.add(excpetionTest1.java:12)
        at excpetionTest1.main(excpetionTest1.java:4)

D:\Final Interview\Core java\Coding practice\6 - Exception handling>

*/

class excpetionTest1{
	public static void main(String [] args){
		
		System.out.println(add());

	}
	static int add(){
		try{
		
		try{
			System.out.println("In try ");
			System.out.println(10/0);
		}
		
		catch(NullPointerException ae)
		{
			System.out.println("In NullPointerException ");
			System.out.println("====================");
			
			//ae.printStackTrace();
			System.out.println("====================");
			
			System.out.println(ae.getMessage());
			System.out.println("====================");
			
			System.out.println(ae.toString());
			System.out.println("====================");
			//return 20;
			
		}		
		finally
		{
			System.out.println("In inner finally Block");
			return 20;
			
		}
		
		
		}
		
		finally{
			System.out.println("In outer finally Block");
			
			
		}

	}
}


/*
D:\Final Interview\Core java\Coding practice\6 - Exception handling>java excpetionTest1.java
In try
In inner finally Block
In outer finally Block
20

D:\Final Interview\Core java\Coding practice\6 - Exception handling>
*/





