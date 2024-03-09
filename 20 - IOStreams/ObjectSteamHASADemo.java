import java.io.*;
class ObjectSteamHASADemo{
	public static void main(String [] args) throws IOException, ClassNotFoundException{
	ObjectOutputStream OO = new ObjectOutputStream (new FileOutputStream("ObjectSteamHASDemo.txt"));
	Student a1= new Student();
	OO.writeObject(a1);
	OO.close();
	System.out.println("Object "+ a1 +" has been written to the file.");
	
	ObjectInputStream OI = new ObjectInputStream (new FileInputStream("ObjectSteamHASDemo.txt"));
	Student a2 = (Student) OI.readObject();
	System.out.println("Below Object has been read from the file - " + a2);
	}
}

class StudentClass implements java.io.Serializable{
	String studClass ="10th";
	StudentClass(){
		
	}
	StudentClass(String studClass){
		this.studClass=studClass;
	}
}
class Student implements java.io.Serializable {
	int studId=10;
	String studName = "Rishikesh";
	String studAddr = "Pune";
	StudentClass studClass = new StudentClass();
	private static final long serialVersionUID = 1L;
	Student(){
		
	}
	Student(int a, String b, String c,String d){
		studClass = new StudentClass(d);
		studId=a;
		studName=b;
		studAddr=c;
	}
	public String toString(){
		return "[ Student Id: "+ studId + " Name: "+ studName + " Student class: " + studClass.studClass + " Address: " + studAddr + " ]";
	}
}


/*

D:\Final Interview\Core java\Coding practice\18 - IOStreams>java ObjectSteamHASADemo.java
Object [ Student Id: 10 Name: Rishikesh Student class: 10th Address: Pune ] has been written to the file.
Below Object has been read from the file - [ Student Id: 10 Name: Rishikesh Student class: 10th Address: Pune ]

D:\Final Interview\Core java\Coding practice\18 - IOStreams>
*/