class DeepCloningTest implements Cloneable{
	int a;
	String name;
	Address adr = new Address();
	
	public DeepCloningTest clone() throws CloneNotSupportedException{
		
		// Performing shallow clone using Object's clone method
		DeepCloningTest D = (DeepCloningTest)super.clone();
		
		// Performing deep clone for the mutable/composite field (Address)
		D.adr = this.adr.clone();
		
		return D;
	}
	
	public static void main(String [] args) throws CloneNotSupportedException{
		DeepCloningTest c1 = new DeepCloningTest();
		c1.a=10;
		c1.name="Rishikesh";
		
		DeepCloningTest c2 = c1.clone();
		System.out.println("==========================");
		System.out.println("c2.a - " + c2.a);
		System.out.println("c1.name - " + c1.name);
		System.out.println("c2.name - " + c2.name);
		System.out.println("c1.adr - " + c1.adr);
		System.out.println("c2.adr - " + c2.adr);
		
		System.out.println("==========================");
		System.out.println("c2.adr.HashCode - " + c2.adr.hashCode());
		System.out.println("c1.adr.HashCode - " + c1.adr.hashCode());
		
		System.out.println("==========================");
		c1.adr.flatNo=2202;
		c1.adr.colony="Kumar Prospera";
		c1.adr.city = "Pune";		
		
		System.out.println("c1.adr - " + c1.adr);
		System.out.println("c2.adr - " + c2.adr);		
		
	}
}

class Address implements Cloneable{
	int flatNo    = 101;
	String colony = "Kumar Prospera";
	String city   = "Pune";
	
	public String toString(){
		return "Flat No: "+Integer.toString(flatNo) + " colony: " +colony+" city: "+city;
	}
	
	public Address clone() throws CloneNotSupportedException{
		return (Address)super.clone();
	}
}

/*

D:\Final Interview\Core java\Coding practice\16 - Fundamental classes>java DeepCloningTest.java
==========================
c2.a - 10
c1.name - Rishikesh
c2.name - Rishikesh
c1.adr - Flat No: 101 colony: Kumar Prospera city: Pune
c2.adr - Flat No: 101 colony: Kumar Prospera city: Pune
==========================
c2.adr.HashCode - 1262773598
c1.adr.HashCode - 688726285
==========================
c1.adr - Flat No: 2202 colony: Kumar Prospera city: Pune
c2.adr - Flat No: 101 colony: Kumar Prospera city: Pune

D:\Final Interview\Core java\Coding practice\16 - Fundamental classes>

*/