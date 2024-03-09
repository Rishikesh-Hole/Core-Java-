class ToStringTest{
	int StudId;
	String StudName;
	String StudAddr;
	
	ToStringTest(int a, String b, String c){
		StudId=a;
		StudName=b;
		StudAddr=c;
	}
	
	public String toString(){
		return "Student Id is " + Integer.toString(StudId) + 
			   "\nStudent name is " + StudName +
			   "\nStudent Address is " + StudAddr;
			   
	}
	
	public static void main(String args[]){
		ToStringTest t1 = new ToStringTest(101, "Rishikesh", "Pune");
		System.out.println(t1);
	}
}


/*
D:\Final Interview\Core java\Coding practice\16 - Fundamental classes>java ToStringTest.java
Student Id is 101
Student name is Rishikesh
Student Address is Pune

D:\Final Interview\Core java\Coding practice\16 - Fundamental classes>

*/