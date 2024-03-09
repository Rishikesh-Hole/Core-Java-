//functional interface test
@FunctionalInterface
interface FuncInterface{
	void m1();
	//void m2(); -- CE error - multiple non-overriding abstract methods found in interface FuncInterface
	void m2(){
		
	}
}

/*
OP-

D:\Final Interview\Core java\interface\coding>javac FuncInterface.java

D:\Final Interview\Core java\interface\coding>javac FuncInterface.java
FuncInterface.java:2: error: Unexpected @FunctionalInterface annotation
@FunctionalInterface
^
  FuncInterface is not a functional interface
    multiple non-overriding abstract methods found in interface FuncInterface
1 error

D:\Final Interview\Core java\interface\coding>

*/


@FunctionalInterface
interface FuncInterface{
	void m1();
	//void m2(); -- CE error - multiple non-overriding abstract methods found in interface FuncInterface
	default void m2(){ // default method is allowed inside functional interface
		
	}
	static void m3(){ // static method is allowed inside functional interface
		
	}
	
	private void m4(){ // private method is allowed inside functional interface
		
	}
}


/*
D:\Final Interview\Core java\interface\coding>javac FuncInterface.java

D:\Final Interview\Core java\interface\coding>
*/