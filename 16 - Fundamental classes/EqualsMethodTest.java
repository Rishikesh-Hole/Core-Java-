class EqualsMethodTest{
	int a=10;
	int b=20;
	
	EqualsMethodTest(){
		
	}

	EqualsMethodTest(int a, int b){
		this.a=a;
		this.b=b;
	}
	
	public boolean equals(Object obj){
		if (this==obj){
			return true;
		}
		else{
			if (obj instanceof EqualsMethodTest){
				EqualsMethodTest E = (EqualsMethodTest) obj;
				
				return this.a==E.a &&
					   this.b==E.b;
			}
			else {
				return false;
			}
		}
	}
	// It is generally recommended and often necessary to override the hashCode method when you override the equals method in Java
	public int hashCode(){
		return Integer.parseInt(Integer.toString(a)+Integer.toString(b));
	}
	public static void main(String [] args){
		EqualsMethodTest e1 = new EqualsMethodTest();
		EqualsMethodTest e2 = new EqualsMethodTest();
		EqualsMethodTest e3 = new EqualsMethodTest(11,22);
		System.out.println("e1.equals(e2)   "+ (e1.equals(e2)));
		System.out.println("e2.equals(e1)   "+ (e2.equals(e1)));
		System.out.println("e1.equals(e3)   "+ (e1.equals(e3)));
		System.out.println("e3.equals(e2)   "+ (e3.equals(e2)));
		
		System.out.println("Hashcode of e1 - "+e1.hashCode());
		System.out.println("Hashcode of e2 - "+e2.hashCode());
		System.out.println("Hashcode of e3 - "+e3.hashCode());
		System.out.println("System Hashcode of e3 - "+System.identityHashCode(e3));

	}
}


/*

D:\Final Interview\Core java\Coding practice\16 - Fundamental classes>java EqualsMethodTest.java
e1.equals(e2)   true
e2.equals(e1)   true
e1.equals(e3)   false
e3.equals(e2)   false
Hashcode of e1 - 1020
Hashcode of e2 - 1020
Hashcode of e3 - 1122
System Hashcode of e3 - 1436901839

D:\Final Interview\Core java\Coding practice\16 - Fundamental classes>

*/