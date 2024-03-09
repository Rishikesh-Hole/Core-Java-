class Years{
	public static void main(String [] args ){
		System.out.println("Inside main !!");
		
		System.out.println("\nPrinting directly eg. Months.JAN !!");
		System.out.println(Months.JAN);
		System.out.println(Months.FEB);
		
		System.out.println("\nPrinting using name eg. Months.JAN.name() !!");
		System.out.println(Months.JAN.name());
		System.out.println(Months.FEB.name());
		
		System.out.println("\nPrinting using ordinal eg. Months.JAN.ordinal() !!");
		System.out.println(Months.JAN.ordinal());
		System.out.println(Months.FEB.ordinal());	

		//System.out.println(Months.values());
		
		System.out.println("\nPrinting using for loop !!");
		Months[] menu = Months.values();
		
		for(Months menuitem:menu){
			System.out.println(menuitem.ordinal() + "  -  "+ menuitem.name());
			//System.out.println(menuitem.name());
		}
		
		//for(Months month)
	}
}

enum Months{
	JAN,FEB,MAR,APR,MAY
}

/*

D:\Final Interview\Core java\Coding practice\enum>java Months.java
Inside main !!

Printing directly eg. Months.JAN !!
JAN
FEB

Printing using name eg. Months.JAN.name() !!
JAN
FEB

Printing using ordinal eg. Months.JAN.ordinal() !!
0
1

Printing using for loop !!
0  -  JAN
1  -  FEB
2  -  MAR
3  -  APR
4  -  MAY

D:\Final Interview\Core java\Coding practice\enum>

*/