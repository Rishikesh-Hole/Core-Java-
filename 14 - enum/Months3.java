class Years{
	public static void main(String [] args ){
		System.out.println("Inside main !!");
		

		for(Months2 item:Months2.values()){
			System.out.println(item.getNum() + "  -  "+ item.name());
		}		
		
	}
}

/*

D:\Final Interview\Core java\Coding practice\enum>java Months2.java
Inside main !!

Printing using for loop !!
2024  -  YEAR
1  -  JAN
2  -  FEB
3  -  MAR

2025  -  YEAR
1  -  JAN
2  -  FEB
3  -  MAR

D:\Final Interview\Core java\Coding practice\enum>java Months3.java
Inside main !!
2024  -  YEAR
1  -  JAN
2  -  FEB
3  -  MAR

D:\Final Interview\Core java\Coding practice\enum>

*/