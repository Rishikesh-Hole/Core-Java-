import java.io.*;
class ObjectSteamDemo{
	public static void main(String [] args) throws IOException, ClassNotFoundException{
	ObjectOutputStream OO = new ObjectOutputStream (new FileOutputStream("ObjectSteamDemo.txt"));
	Student a1= new Student();
	OO.writeObject(a1);
	OO.close();
	System.out.println("Object "+ a1 +" has been written to the file.");
	
	ObjectInputStream OI = new ObjectInputStream (new FileInputStream("ObjectSteamDemo.txt"));
	Student a2 = (Student) OI.readObject();
	System.out.println("Below Object has been read from the file - " + a2);
	}
}

class Student implements java.io.Serializable{
	int studId=10;
	String studName = "Rishikesh";
	String studAddr = "Pune";
	
	public String toString(){
		return "[ Student Id: "+ studId + " Name: "+ studName + " Address: " + studAddr + " ]";
	}
}


/*
D:\Final Interview\Core java\Coding practice\18 - IOStreams>java ObjectSteamDemo.java
Object [ Student Id: 10 Name: Rishikesh Address: Pune ] has been written to the file.
Below Object has been read from the file - [ Student Id: 10 Name: Rishikesh Address: Pune ]

D:\Final Interview\Core java\Coding practice\18 - IOStreams>
*/


/*
data written to the file-
¬í sr StudentZ!ñHïx¼ I studIdL studAddrt Ljava/lang/String;L studNameq ~ xp   
t Punet 	Rishikesh
*/