// To create a custom ordinal / indexing in enum

class Years{
	public static void main(String [] args ){
		System.out.println("Inside main !!");
		
		System.out.println("\nPrinting using for loop !!");
		
		Months2[] menu = Months2.values();
		
		for(Months2 menuitem:menu){
			System.out.println(menuitem.getNum() + "  -  "+ menuitem.name());
		}
		
		System.out.println();
		Months2.YEAR.setNum(2025); // note - this assignment is limited to this thread only. It will not change actual data inside Months2.class file
		
		for(Months2 item:Months2.values()){
			System.out.println(item.getNum() + "  -  "+ item.name());
		}		
		
	}
}

public enum Months2{
	YEAR(2024),JAN(1),FEB(2),MAR(3);
	
	private int num;
	
	Months2(int num){
		this.num=num;
	}
	
	public int getNum(){
		return num;
	}
	
	public void setNum(int num){
		this.num=num;
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


*/