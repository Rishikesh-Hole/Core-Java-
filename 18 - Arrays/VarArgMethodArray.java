//var-arg parameter method
class VarArgMethodArray{
	static void getArray(int ...numbers){
		for (int item:numbers){
			System.out.println(item);
		}
	}
	
	static void getArray(int[] ...numbers){
		for (int[] outeritem:numbers){
			
			for (int inneritem:outeritem){
				System.out.println(inneritem);
			}
			
		}
	}	
	
	public static void main(String [] args){
		int[] a = {10,20,30};
		int[] b = {100,200,300};
		int[][] c = {{1,2,3},{4,5,6}};
		System.out.println("=================");
		getArray(a);
		System.out.println("=================");
		getArray(b);
		System.out.println("=================");
		getArray(c);
		System.out.println("=================");
	}
}

/*

D:\Final Interview\Core java\Arrays\Coding>java VarArgMethodArray.java
=================
10
20
30
=================
100
200
300
=================
1
2
3
4
5
6
=================

D:\Final Interview\Core java\Arrays\Coding>


*/