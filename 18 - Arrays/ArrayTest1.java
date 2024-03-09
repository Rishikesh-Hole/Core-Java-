class PassingArray{
	static void m1(int [] a){
		a[1]=22;
	}
	
	static void m2(int a){
		a=22;
	}
	
	
	public static void main(String [] args){
		int [] c = {10,20,30};
		int a1=10;
		System.out.println("Before changing value using method parameter");
		for (int eachItem:c){
			System.out.println(eachItem);
		}
		
		m1(c);
		
		System.out.println("\nAfter changing value using method parameter");
		for (int eachItem:c){
			System.out.println(eachItem);
		}
		
		System.out.println("\na1 (Before changing value using method parameter) " + a1);
		m2(a1);
		System.out.println("a1 (After changing value using method parameter) " + a1);
	}
}


/*

D:\Final Interview\Core java\Coding practice\16 - Arrays>java ArrayTest1.java
Before changing value using method parameter
10
20
30

After changing value using method parameter
10
22
30

a1 (Before changing value using method parameter) 10
a1 (After changing value using method parameter) 10

D:\Final Interview\Core java\Coding practice\16 - Arrays>

*/