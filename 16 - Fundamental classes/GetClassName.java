class GetClassName{
		
	public static void main(String args[]){
		GetClassName t1 = new GetClassName();
		Class cls = t1.getClass();
		String clasName = cls.getName();
		System.out.println("Class name is " + clasName);
		System.out.println("Class name is " + t1.getClass().getName());
	}
}


/*
D:\Final Interview\Core java\Coding practice\16 - Fundamental classes>java GetClassName.java
Class name is GetClassName
Class name is GetClassName

D:\Final Interview\Core java\Coding practice\16 - Fundamental classes>

*/