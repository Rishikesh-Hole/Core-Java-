// interface 
class ABC implements InterfaceTest2, InterfaceTest1{
	public static void main(String [] args){
		System.out.println("Inside ABC - main() method !!");
	}
	
}



interface InterfaceTest1{
	default void m1(){
		
	}
	
}

interface InterfaceTest2{
	default void m1(){
		
	}
	
}

/*

D:\Final Interview\Core java\interface\coding>java InterfaceTest4.java
InterfaceTest4.java:2: error: types InterfaceTest2 and InterfaceTest1 are incompatible;
class ABC implements InterfaceTest2, InterfaceTest1{
^
  class ABC inherits unrelated defaults for m1() from types InterfaceTest2 and InterfaceTest1
1 error
error: compilation failed

D:\Final Interview\Core java\interface\coding>


*/