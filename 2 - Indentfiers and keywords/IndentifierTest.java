class IndentifierTest{
	public static void main(String[] args)
	{
		System.out.println("Hello");
		int _______$$$$;
		 _______$$$$ = 100;
		System.out.println(_______$$$$ + "  - allowed");
		
		int 123ABC;  // not allowed
		
	}
}

/*


D:\Final Interview\Core java\Coding practice\2 - Indentfiers and keywords>java IndentifierTest.java
IndentifierTest.java:6: error: variable _______$$$$ might not have been initialized
                System.out.println(_______$$$$ + "  - allowed");
                                   ^
1 error
error: compilation failed

D:\Final Interview\Core java\Coding practice\2 - Indentfiers and keywords>
D:\Final Interview\Core java\Coding practice\2 - Indentfiers and keywords>


## Added line 6   _______$$$$ = 100;
D:\Final Interview\Core java\Coding practice\2 - Indentfiers and keywords>java IndentifierTest.java
Hello
100  - allowed

D:\Final Interview\Core java\Coding practice\2 - Indentfiers and keywords>
D:\Final Interview\Core java\Coding practice\2 - Indentfiers and keywords>



## Added line 9 - int 123ABC;

D:\Final Interview\Core java\Coding practice\2 - Indentfiers and keywords>java IndentifierTest.java
IndentifierTest.java:9: error: not a statement
                int 123ABC;
                ^
IndentifierTest.java:9: error: ';' expected
                int 123ABC;
                   ^
IndentifierTest.java:9: error: not a statement
                int 123ABC;
                       ^
3 errors
error: compilation failed

D:\Final Interview\Core java\Coding practice\2 - Indentfiers and keywords>
D:\Final Interview\Core java\Coding practice\2 - Indentfiers and keywords>

*/
