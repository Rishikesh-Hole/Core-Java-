class CloningTest1 implements Cloneable{
	int a;
	String name;
	Address adr = new Address();
	public static void main(String [] args) throws CloneNotSupportedException{
		CloningTest1 c1 = new CloningTest1();
		c1.a=10;
		c1.name="Rishikesh";
		System.out.println("c1.a - " + c1.a);
		
		CloningTest1 c2 = (CloningTest1)c1.clone();
		System.out.println("c2.a - " + c2.a);
		System.out.println("c1.name - " + c1.name);
		System.out.println("c2.name - " + c2.name);
		
		System.out.println("c1 HashCode - " + c1.hashCode());
		System.out.println("c1 HashCode - " + c2.hashCode());
		
		c2.a=30;
		System.out.println("c2.a - " + c2.a);
		System.out.println("c1.a - " + c1.a);
		
		c1.a=40;
		System.out.println("c2.a - " + c2.a);
		System.out.println("c1.a - " + c1.a);
		
		
		c2.name="Sayli";
		System.out.println("c2.name - " + c2.name);
		System.out.println("c1.name - " + c1.name);
		
		c1.name="Charvi";
		System.out.println("c2.name - " + c2.name);
		System.out.println("c1.name - " + c1.name);
		
		System.out.println("c1.adr == c2.adr is " + (c1.adr == c2.adr));
		System.out.println("c2.adr.HashCode - " + c2.adr.hashCode());  // copied composite objects reference only, not the memory location.
		System.out.println("c1.adr.HashCode - " + c1.adr.hashCode());  // adr of c1 and c2 both are pointing to the same memory location. Shallow Cloning
		
		System.out.println("c1.adr - " + c1.adr);
		System.out.println("c2.adr - " + c2.adr);
		
		c1.adr.flatNo=2202;
		c1.adr.colony="Kumar Prospera";
		c1.adr.city = "Pune";
		
		System.out.println("c1.adr - " + c1.adr);
		System.out.println("c2.adr - " + c2.adr);	
		
		System.out.println("c2.adr.HashCode - " + c2.adr.hashCode());
		System.out.println("c1.adr.HashCode - " + c1.adr.hashCode());
		
	}
}

class Address{
	int flatNo    = 101;
	String colony = "Kumar Prospera";
	String city   = "Pune";
	
	public String toString(){
		return "Flat No: "+Integer.toString(flatNo) + " colony: " +colony+" city: "+city;
	}
}


/*

D:\Final Interview\Core java\Coding practice\16 - Fundamental classes>java CloningTest1.java
c1.a - 10
c2.a - 10
c1.name - Rishikesh
c2.name - Rishikesh
c1 HashCode - 1826699684
c1 HashCode - 1769193365
c2.a - 30
c1.a - 10
c2.a - 30
c1.a - 40
c2.name - Sayli
c1.name - Rishikesh
c2.name - Sayli
c1.name - Charvi
c1.adr == c2.adr is true
c2.adr.HashCode - 769429195
c1.adr.HashCode - 769429195
c1.adr - Flat No: 101 colony: Kumar Prospera city: Pune
c2.adr - Flat No: 101 colony: Kumar Prospera city: Pune
c1.adr - Flat No: 2202 colony: Kumar Prospera city: Pune
c2.adr - Flat No: 2202 colony: Kumar Prospera city: Pune
c2.adr.HashCode - 769429195
c1.adr.HashCode - 769429195

D:\Final Interview\Core java\Coding practice\16 - Fundamental classes>

*/