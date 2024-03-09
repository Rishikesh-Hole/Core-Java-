import java.io.*;
class ObjectSteamISADemo{
	public static void main(String [] args) throws IOException, ClassNotFoundException{
	ObjectOutputStream OO = new ObjectOutputStream (new FileOutputStream("ObjectSteamDemo.txt"));
	Student a1= new Student();
	OO.writeObject(a1);
	OO.close();
	System.out.println("Object "+ a1 +" has been written to the file.");
	
	ObjectInputStream OI = new ObjectInputStream (new FileInputStream("ObjectSteamDemo1.txt"));
	Student a2 = (Student) OI.readObject();
	System.out.println("Below Object has been read from the file - " + a2);
	}
}

class StudentClass{
	String studClass ="10th";
}
class Student extends StudentClass implements java.io.Serializable {
	int studId=10;
	String studName = "Rishikesh";
	String studAddr = "Pune";
	private static final long serialVersionUID = 1L;
	Student(){
		
	}
	Student(int a, String b, String c){
		studId=a;
		studName=b;
		studAddr=c;
	}
	public String toString(){
		return "[ Student Id: "+ studId + " Name: "+ studName + " Student class: " + super.studClass + " Address: " + studAddr + " ]";
	}
}


/*
## if I change the Object file and try to deserialized the object.
¬í sr StudentZ!ñHïx¼ I studIdL studAddrt Ljava/lang/String;L studNameq ~ xp   
t Punet 	Kishor

D:\Final Interview\Core java\Coding practice\18 - IOStreams>java ObjectSteamISADemo.java
Object [ Student Id: 10 Name: Rishikesh Student class: 10th Address: Pune ] has been written to the file.
Exception in thread "main" java.io.EOFException
        at java.base/java.io.ObjectInputStream$PeekInputStream.readFully(ObjectInputStream.java:2933)
        at java.base/java.io.ObjectInputStream$BlockDataInputStream.readUTFBody(ObjectInputStream.java:3710)
        at java.base/java.io.ObjectInputStream$BlockDataInputStream.readUTF(ObjectInputStream.java:3498)
        at java.base/java.io.ObjectInputStream.readString(ObjectInputStream.java:2120)
        at java.base/java.io.ObjectInputStream.readObject0(ObjectInputStream.java:1744)
        at java.base/java.io.ObjectInputStream$FieldValues.<init>(ObjectInputStream.java:2618)
        at java.base/java.io.ObjectInputStream.readSerialData(ObjectInputStream.java:2469)
        at java.base/java.io.ObjectInputStream.readOrdinaryObject(ObjectInputStream.java:2284)
        at java.base/java.io.ObjectInputStream.readObject0(ObjectInputStream.java:1762)
        at java.base/java.io.ObjectInputStream.readObject(ObjectInputStream.java:540)
        at java.base/java.io.ObjectInputStream.readObject(ObjectInputStream.java:498)
        at ObjectSteamISADemo.main(ObjectSteamISADemo.java:11)

D:\Final Interview\Core java\Coding practice\18 - IOStreams>

Above error is becase i dont have parameterized constructor.
*/

/*
after modifying ObjectSteamDemo1.txt, changed RIshikesh to Rushikesh

D:\Final Interview\Core java\Coding practice\18 - IOStreams>java ObjectSteamISADemo.java
Object [ Student Id: 10 Name: Rishikesh Student class: 10th Address: Pune ] has been written to the file.
Below Object has been read from the file - [ Student Id: 10 Name: Rushikesh Student class: 10th Address: Pune ]

D:\Final Interview\Core java\Coding practice\18 - IOStreams>

*/

/*
after modifying ObjectSteamDemo1.txt, changed Rishikesh to Charviiii

D:\Final Interview\Core java\Coding practice\18 - IOStreams>java ObjectSteamISADemo.java
Object [ Student Id: 10 Name: Rishikesh Student class: 10th Address: Pune ] has been written to the file.
Below Object has been read from the file - [ Student Id: 10 Name: Charviiii Student class: 10th Address: Pune ]
*/


/*
after modifying ObjectSteamDemo1.txt, changed Rishikesh to Charvi

D:\Final Interview\Core java\Coding practice\18 - IOStreams>java ObjectSteamISADemo.java
Object [ Student Id: 10 Name: Rishikesh Student class: 10th Address: Pune ] has been written to the file.
Exception in thread "main" java.io.EOFException
        at java.base/java.io.ObjectInputStream$PeekInputStream.readFully(ObjectInputStream.java:2933)
        at java.base/java.io.ObjectInputStream$BlockDataInputStream.readUTFBody(ObjectInputStream.java:3710)
        at java.base/java.io.ObjectInputStream$BlockDataInputStream.readUTF(ObjectInputStream.java:3498)
        at java.base/java.io.ObjectInputStream.readString(ObjectInputStream.java:2120)
        at java.base/java.io.ObjectInputStream.readObject0(ObjectInputStream.java:1744)
        at java.base/java.io.ObjectInputStream$FieldValues.<init>(ObjectInputStream.java:2618)
        at java.base/java.io.ObjectInputStream.readSerialData(ObjectInputStream.java:2469)
        at java.base/java.io.ObjectInputStream.readOrdinaryObject(ObjectInputStream.java:2284)
        at java.base/java.io.ObjectInputStream.readObject0(ObjectInputStream.java:1762)
        at java.base/java.io.ObjectInputStream.readObject(ObjectInputStream.java:540)
        at java.base/java.io.ObjectInputStream.readObject(ObjectInputStream.java:498)
        at ObjectSteamISADemo.main(ObjectSteamISADemo.java:11)

D:\Final Interview\Core java\Coding practice\18 - IOStreams>
*/


/*
after modifying ObjectSteamDemo1.txt, changed Rishikesh to rishikesh
D:\Final Interview\Core java\Coding practice\18 - IOStreams>java ObjectSteamISADemo.java
Object [ Student Id: 10 Name: Rishikesh Student class: 10th Address: Pune ] has been written to the file.
Below Object has been read from the file - [ Student Id: 10 Name: rishikesh Student class: 10th Address: Pune ]

D:\Final Interview\Core java\Coding practice\18 - IOStreams>

*/

/*
Pune to pune

D:\Final Interview\Core java\Coding practice\18 - IOStreams>java ObjectSteamISADemo.java
Object [ Student Id: 10 Name: Rishikesh Student class: 10th Address: Pune ] has been written to the file.
Below Object has been read from the file - [ Student Id: 10 Name: rishikesh Student class: 10th Address: pune ]

D:\Final Interview\Core java\Coding practice\18 - IOStreams>
*/


// All above example means - we can not change the size of data, but we can change the data.