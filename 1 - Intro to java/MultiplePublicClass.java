class MuliptlePublicClass{
	public static void main (String[] args)
	{
		System.out.println("Multiple public class!!");
	}
}

class A{
	public static void main (String[] args)
	{
		System.out.println("Multiple public class!!");
	}
}

class B{
	public static void main (String[] args)
	{
		System.out.println("Multiple public class!!");
	}
}

class C{
	public static void main (String[] args)
	{
		System.out.println("Multiple public class!!");
	}
}


/*

D:\Final Interview\Core java\Coding practice\1 - Intro to java>javac MultiplePublicClass.java
MultiplePublicClass.java:8: error: class A is public, should be declared in a file named A.java
public class A{
       ^
MultiplePublicClass.java:15: error: class B is public, should be declared in a file named B.java
public class B{
       ^
2 errors

D:\Final Interview\Core java\Coding practice\1 - Intro to java>
D:\Final Interview\Core java\Coding practice\1 - Intro to java>


## Removing public from B
D:\Final Interview\Core java\Coding practice\1 - Intro to java>javac MultiplePublicClass.java
MultiplePublicClass.java:8: error: class A is public, should be declared in a file named A.java
public class A{
       ^
1 error

D:\Final Interview\Core java\Coding practice\1 - Intro to java>

Error because file name should  be public class name.

## Removing public from A 


D:\Final Interview\Core java\Coding practice\1 - Intro to java>java A
Multiple public class!!

D:\Final Interview\Core java\Coding practice\1 - Intro to java>
D:\Final Interview\Core java\Coding practice\1 - Intro to java>java B
Multiple public class!!

D:\Final Interview\Core java\Coding practice\1 - Intro to java>java C
Multiple public class!!

D:\Final Interview\Core java\Coding practice\1 - Intro to java>



*/
