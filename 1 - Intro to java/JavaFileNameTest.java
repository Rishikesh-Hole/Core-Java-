public class JavaFileNameTest

{
public static void main(String[] args )
{
	System.out.println("Hi.. Welcome to java!!");
}

}
/*

##Without public class
D:\Final Interview\Core java\Coding practice\1 - Intro to java>java JavaFileNameTest.java
Hi.. Welcome to java!!

D:\Final Interview\Core java\Coding practice\1 - Intro to java>
D:\Final Interview\Core java\Coding practice\1 - Intro to java>



##With public class

D:\Final Interview\Core java\Coding practice\1 - Intro to java>javac JavaFileNameTest.java
JavaFileNameTest.java:1: error: class FirstJavaProgram is public, should be declared in a file named FirstJavaProgram.java
public class FirstJavaProgram
       ^
1 error

D:\Final Interview\Core java\Coding practice\1 - Intro to java>
D:\Final Interview\Core java\Coding practice\1 - Intro to java>


## Rename class name to JavaFileNameTest and compile again
D:\Final Interview\Core java\Coding practice\1 - Intro to java>
D:\Final Interview\Core java\Coding practice\1 - Intro to java>javac JavaFileNameTest.java

D:\Final Interview\Core java\Coding practice\1 - Intro to java>
D:\Final Interview\Core java\Coding practice\1 - Intro to java>
D:\Final Interview\Core java\Coding practice\1 - Intro to java>java JavaFileNameTest
Hi.. Welcome to java!!

D:\Final Interview\Core java\Coding practice\1 - Intro to java>

*/