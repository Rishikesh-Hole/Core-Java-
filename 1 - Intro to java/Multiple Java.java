class MultipleJava{
	public static void main(String[] args)
	{
		System.out.println("In main");
		MultipleJava.main(new String[0]);
	}
}

/*

D:\Final Interview\Core java\Coding practice\1 - Intro to java>java "Multiple Java".java
In main

D:\Final Interview\Core java\Coding practice\1 - Intro to java>
D:\Final Interview\Core java\Coding practice\1 - Intro to java>

D:\Final Interview\Core java\Coding practice\1 - Intro to java>javac "Multiple Java".java

D:\Final Interview\Core java\Coding practice\1 - Intro to java>

## Adding MultipleJava.main(new String[0]); @ 5

D:\Final Interview\Core java\Coding practice\1 - Intro to java>
D:\Final Interview\Core java\Coding practice\1 - Intro to java>java "Multiple Java".java
In main
In main
In main
In main
In main
In main
In main
In main
In main
In main
In main
In main
In main
In main
In main
In main
In main
In main

Above will lea to StackOverFlow error


*/