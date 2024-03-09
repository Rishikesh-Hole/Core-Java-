class Relations{
	public static void main(String [] args){
		System.out.println("================================");
		
		System.out.println("Creating first Son object.. \n");
		Son son1 = new Son();
		System.out.println("================================");
		
		System.out.println("Creating second Son object.. \n");
		Son son2 = new Son();
		System.out.println("================================\n");
		
		son1.grandFatherMethodStatic();
		son1.grandFatherMethodNonStatic();
		son1.fatherMethodStatic();
		son1.fatherMethodNonStatic();
		son1.sonMethodNonStatic();
		son1.sonMethodStatic();
		son1.toString();
		son1.grandFatherProperty();
		son1.methodHidding();
		son1.methodOverriding();
		son1.methodOverloading();
		son1.methodOverloading(10);
		son1.methodOverloading(10,20);
		
		System.out.println("================================\n");
		System.out.println("upcasting ...  GrandFather GF1 = new Son() ");
		GrandFather GF1 = new Son();
		GF1.grandFatherMethodStatic();
		GF1.grandFatherMethodNonStatic();
		//GF1.fatherMethodStatic();  -- error: cannot find symbol
		//GF1.fatherMethodNonStatic(); -- error: cannot find symbol
		//GF1.sonMethodNonStatic(); -- error: cannot find symbol
		//GF1.sonMethodStatic(); -- error: cannot find symbol
		GF1.toString();
		GF1.grandFatherProperty();
		GF1.methodHidding();
		GF1.methodOverriding();
		GF1.methodOverloading();
		//GF1.methodOverloading(10); // error: method methodOverloading in class GrandFather cannot be applied to given types;
		//GF1.methodOverloading(10,20);// error: method methodOverloading in class GrandFather cannot be applied to given types;
		
		System.out.println("================================\n");
		System.out.println("Downcasting ( Father level )... Father son3 = (Son) GF1 ");
		
		Father son3 = (Son) GF1;
		son3.grandFatherMethodStatic();
		son3.grandFatherMethodNonStatic();
		son3.fatherMethodStatic();
		son3.fatherMethodNonStatic();
		//son3.sonMethodNonStatic();  -- error: cannot find symbol
		//son3.sonMethodStatic();     -- error: cannot find symbol
		son3.toString();
		son3.grandFatherProperty();	
		son3.methodHidding();
		son3.methodOverriding();
		son3.methodOverloading();
		son3.methodOverloading(10);
		//son3.methodOverloading(10,20); //error: no suitable method found for methodOverloading(int,int)

		
		System.out.println("================================\n");
		System.out.println("Downcasting ( Son level )... Son son4 = (Son) GF1 ");
		
		Son son4 = (Son) GF1;
		son4.grandFatherMethodStatic();
		son4.grandFatherMethodNonStatic();
		son4.fatherMethodStatic();
		son4.fatherMethodNonStatic();
		son4.sonMethodNonStatic();
		son4.sonMethodStatic();
		son4.toString();
		son4.grandFatherProperty();	
		son4.methodHidding();
		son4.methodOverriding();
		son4.methodOverloading();
		son4.methodOverloading(10);
		son4.methodOverloading(10,20);
		
	}
}

class GrandFather{
	static int grandFatherAge;
	static String grandFatherName;
	String grandFatherEdu;
	
	GrandFather(){
		grandFatherAge  = 10;
		grandFatherName = "Rishikesh";
		grandFatherEdu  = "BE";
	}
	GrandFather(int grandFatherAge, String grandFatherName, String grandFatherEdu){
		
		this.grandFatherAge  = grandFatherAge;
		this.grandFatherName = grandFatherName;
		this.grandFatherEdu  = grandFatherEdu;
	}
	
	static{
		System.out.println("Inside GrandFather static block ");
	}
	
	{
		System.out.println("Inside GrandFather non-static block ");
	}
	
	static void grandFatherMethodStatic(){
		System.out.println("Inside GrandFather - grandFatherMethodStatic()");
	}
	
	void grandFatherMethodNonStatic(){
		System.out.println("Inside GrandFather -  grandFatherMethodNonStatic() ");
	}
	
	public String toString(){
		System.out.println("grandFatherAge: "+grandFatherAge+"\ngrandFatherName: "+grandFatherName+"\ngrandFatherEdu: "+grandFatherName);
		return "";
	}
	
	void grandFatherProperty(){
		System.out.println("Inside GrandFather -  grandFatherProperty() ");
	}
	
	static void methodHidding(){
		System.out.println("Inside GrandFather -  methodHidding() ");
	}
	
	void methodOverriding(){
		System.out.println("Inside GrandFather -  methodOverriding() ");
	}
	
	void methodOverloading(){
		System.out.println("Inside GrandFather -  methodOverloading() ");
	}
}

class Father extends GrandFather{
	static int fatherAge;
	static String fatherName;
	String fatherEdu;
	
	Father(){
		fatherAge=10;
		fatherName="Rishikesh";
		fatherEdu="B.Com";
	}
	Father(int fatherAge, String fatherName, String fatherEdu){
		
		this.fatherAge  =fatherAge;
		this.fatherName =fatherName;
		this.fatherEdu  =fatherEdu;
	}
	
	static{
		System.out.println("Inside father static block ");
	}
	
	{
		System.out.println("Inside father non-static block ");
	}
	
	static void fatherMethodStatic(){
		System.out.println("Inside father - fatherMethodStatic()");
	}
	
	void fatherMethodNonStatic(){
		System.out.println("Inside father - fatherMethodNonStatic()");
	}	
	
	public String toString(){
		System.out.println("fatherAge: "+fatherAge+"\nfatherName: "+fatherName+"\nfatherEdu: "+fatherEdu);
		return "";
	}	
	
	void grandFatherProperty(){
		System.out.println("Inside Father -  grandFatherProperty() ");
	}	
	
	static void methodHidding(){
		System.out.println("Inside Father -  methodHidding() ");
	}
	
	void methodOverriding(){
		System.out.println("Inside Father -  methodOverriding() ");
	}
	
	void methodOverloading(int a){
		System.out.println("Inside Father -  methodOverloading() ");
	}
}

class Son extends Father{
	static int sonAge;
	static String sonName;	
	String sonEdu;
	Son(){
		sonAge=10;
		sonName="Rishikesh";
		sonEdu="BE";
	}
	Son(int sonAge, String sonName, String sonEdu){
		
		this.sonAge  =sonAge;
		this.sonName =sonName;
		this.sonEdu  =sonEdu;
	}
	static{
		System.out.println("Inside son static block ");
	}
	
	{
		System.out.println("Inside son non-static block ");
	}
	
	static void sonMethodStatic(){
		System.out.println("Inside son - sonMethodStatic() ");
	}
	
	void sonMethodNonStatic(){
		System.out.println("Inside son - sonMethodNonStatic()");
	}
	
	public String toString(){
		System.out.println("sonAge: "+grandFatherAge+"\nsonName: "+sonName+"\nsonEdu: "+sonEdu);
		return "";
	}	
	
	void grandFatherProperty(){
		System.out.println("Inside son -  grandFatherProperty() ");
	}
	
	static void methodHidding(){
		System.out.println("Inside son -  methodHidding() ");
	}
	
	void methodOverriding(){
		System.out.println("Inside son -  methodOverriding() ");
	}
	
	void methodOverloading(int a, int b){
		System.out.println("Inside son -  methodOverloading() ");
	}
	
}
