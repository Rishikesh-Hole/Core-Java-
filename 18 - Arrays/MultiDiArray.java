class MultiDiArray{
	static int value=1;
	static void getArray(int [][] a){
		for (int[] outeritem:a){
			System.out.println("========");
			for(int innerItem:outeritem){
				System.out.println(innerItem);
			}
		}
	}
	
	static void setArray(int [][] a){
		for (int row = 0; row<a.length; row++){
			for(int col=0; col<a[row].length; col++)
			{
				a[row][col]=value;
				value++;
			}
		}
	}	
	
	public static void main(String [] args){
		int [][] A = new int[3][];
		A[0]= new int[2];
		A[1]= new int[3];
		A[2]= new int[4];
		
		System.out.println(" Array A length - " + A.length);
		getArray(A);
		
		setArray(A);
		getArray(A);
				
		System.out.println("******************************");
		int [][] B = new int[2][];
		System.out.println(" Array B length - " + B.length);
		B[0] = new int[]{11,22,33,44};
		B[1] = new int[]{21,22,33};
		getArray(B);
		
		System.out.println("******************************");
		int [][] C;
		C = new int[][]{{11,22,33,44},{1,2,3}};
		System.out.println(" Array C length - " + C.length);
		getArray(C);
		
		System.out.println("******************************");
		int [][] D = new int[][]{{111,222,333,444},{555,666,777}};
		System.out.println(" Array D length - " + D.length);
		getArray(D);
		
	}
}


/*

D:\Final Interview\Core java\Coding practice\16 - Arrays>java MultiDiArray.java
 Array A length - 3
========
0
0
========
0
0
0
========
0
0
0
0
========
1
2
========
3
4
5
========
6
7
8
9
******************************
 Array B length - 2
========
11
22
33
44
========
21
22
33
******************************
 Array C length - 2
========
11
22
33
44
========
1
2
3
******************************
 Array D length - 2
========
111
222
333
444
========
555
666
777

D:\Final Interview\Core java\Coding practice\16 - Arrays>
*/