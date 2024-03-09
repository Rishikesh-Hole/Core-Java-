class EqualOpTest{
	public static void main(String [] args){
		
		// == operator testing 
		EqualOpTest e1 = new EqualOpTest();
		EqualOpTest e2 = new EqualOpTest();
		EqualOpTest e3=e2;
		
		System.out.println("e1==e2  " + (e1==e2));
		System.out.println("e3==e2  "+ (e3==e2));
		System.out.println("e1==e3  "+ (e1==e3));
		
		Object obj=null;
		System.out.println("obj==e3  "+ (obj==e3));
		
		A a = new A();
		//System.out.println(a==e3); // error: incomparable types: A and EqualOpTest
		
		System.out.println("null==null  "+ (null==null));
		System.out.println("obj==null   "+ (obj==null));
		System.out.println("e3==null   "+ (e3==null));
		
		//equals method testing 
		// System.out.println("null.equals(e3)   "+ (null.equals(e3))); // error: <null> cannot be dereferenced
		System.out.println("e1.equals(e3)   "+ (e1.equals(e3)));
		System.out.println("e2.equals(e3)   "+ (e2.equals(e3)));
	}
}

class A{
	
}