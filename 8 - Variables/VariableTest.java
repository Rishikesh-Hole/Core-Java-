class VariableTest{
	static int staticVar;
	int nonStaticVar;
	//final static int staticVar2; //error: variable staticVar2 might not have been initialized
	final static int staticVar2=20;
	//final int finalnonStaticVar; //error: variable finalnonStaticVar not initialized in the default constructor
	final int finalnonStaticVar=10;
	transient int transientNonStaticVar;
	volatile int volatileNonStaticVar;
	// staticVar=10;   error: <identifier> expected - we can't write logic at class level.
	
	int m1(final int a, int b){
		final int c;
		c=a+b;
		return c;
	}
	
	public static void main(String [] args){
		System.out.println("staticVar - "+VariableTest.staticVar);
		System.out.println("final staticVar2 - "+VariableTest.staticVar2);
		System.out.println("nonStaticVar - "+(new VariableTest()).nonStaticVar);
		System.out.println("finalnonStaticVar - "+(new VariableTest()).finalnonStaticVar);
		System.out.println("transientNonStaticVar - "+(new VariableTest()).transientNonStaticVar);
		System.out.println("volatileNonStaticVar - "+(new VariableTest()).volatileNonStaticVar);
		
		System.out.println("int m1(final int a, int b) - "+ (new VariableTest()).m1(10,20));
	}
}


/*

D:\Final Interview\Core java\Coding practice\8 - Variables>java VariableTest.java
staticVar - 0
final staticVar2 - 20
nonStaticVar - 0
finalnonStaticVar - 10
transientNonStaticVar - 0
volatileNonStaticVar - 0
int m1(final int a, int b) - 30

D:\Final Interview\Core java\Coding practice\8 - Variables>

*/