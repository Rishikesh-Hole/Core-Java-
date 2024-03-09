@FunctionalInterface
interface FuncInterface2 extends FuncInterface1{
	void m1();
	/*void m2(){
		
	}*/

}


@FunctionalInterface
interface FuncInterface1{
	void m2();
}


/*
D:\Final Interview\Core java\interface\coding>javac FuncInterface2.java
FuncInterface2.java:4: error: interface abstract methods cannot have body
        void m2(){
                 ^
FuncInterface2.java:1: error: Unexpected @FunctionalInterface annotation
@FunctionalInterface
^
  FuncInterface2 is not a functional interface
    multiple non-overriding abstract methods found in interface FuncInterface2
2 errors

D:\Final Interview\Core java\interface\coding>
D:\Final Interview\Core java\interface\coding>javac FuncInterface2.java
FuncInterface2.java:1: error: Unexpected @FunctionalInterface annotation
@FunctionalInterface
^
  FuncInterface2 is not a functional interface
    multiple non-overriding abstract methods found in interface FuncInterface2
1 error

D:\Final Interview\Core java\interface\coding>
*/