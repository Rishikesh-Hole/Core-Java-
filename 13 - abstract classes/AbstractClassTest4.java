// final abstract class AbstractClassTest4{   error: illegal combination of modifiers: abstract and final
// default abstract class AbstractClassTest4{  -- error: modifier default not allowed here 
//public abstract class AbstractClassTest4{ // allowed
strictfp abstract class AbstractClassTest4{
	
}

/*
D:\Final Interview\Core java\Coding practice\13 - abstract classes>javac AbstractClassTest4.java
AbstractClassTest4.java:4: warning: [strictfp] as of release 17, all floating-point expressions are evaluated strictly and 'strictfp' is not required
public strictfp abstract class AbstractClassTest4{
                         ^
1 warning

D:\Final Interview\Core java\Coding practice\13 - abstract classes>
*/