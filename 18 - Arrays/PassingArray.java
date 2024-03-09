class PassingArray{
	static void m1(int [] a){
		System.out.println("Traversing through array using regular for loop");
		for (int i=0;i<a.length; i++){
			System.out.println(a[i]);
		}
		
		System.out.println("Traversing through array using regular for-each loop");
		for (int eachItem:a){
			System.out.println(eachItem);
		}
	}
	
	public static void main(String [] args){
		int [] c ={10,20,30};
		m1(c);
		
		m1(new int[3]);
		
		// m1({10,20,30}); -- invalid
		
		m1(new int[] {111,222,333,444});
	}
}


/*

D:\Final Interview\Core java\Coding practice\16 - Arrays>java PassingArray.java
Traversing through array using regular for loop
10
20
30
Traversing through array using regular for-each loop
10
20
30
Traversing through array using regular for loop
0
0
0
Traversing through array using regular for-each loop
0
0
0
Traversing through array using regular for loop
111
222
333
444
Traversing through array using regular for-each loop
111
222
333
444

*/