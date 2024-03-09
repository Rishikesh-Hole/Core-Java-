import java.util.*;

class MyClass{
	int studId;
	String studName;
	MyClass(int studId, String studName){
		this.studId = studId;
		this.studName = studName;
	}
	
	public String toString(){
		return "[ Studen ID: "+studId+" Name: "+studName+"]";
	}
	

	public static void main(String [] args){
		TreeSet<MyClass> TS = new TreeSet<MyClass>(new MyClassComparator());
		TS.add(new MyClass(101, "Rishikesh"));
		TS.add(new MyClass(103, "Ankit"));
		TS.add(new MyClass(102, "Karan"));
		TS.add(new MyClass(110, "Sankalp"));
		TS.add(new MyClass(110, "Sankalp"));
		
		TS.forEach(System.out::println);
		
	}
}

class MyClassComparator implements Comparator<MyClass>{ // <MyClass> this is importent else you need to override method as compare(Object M1, Object M2) 
	public int compare(MyClass M1, MyClass M2){ 
		return Integer.compare(M1.studId, M2.studId);
	}
}

/*
D:\Final Interview\Collection framwork\coding>java MyClassComparator.java
[ Studen ID: 101 Name: Rishikesh]
[ Studen ID: 102 Name: Karan]
[ Studen ID: 103 Name: Ankit]
[ Studen ID: 110 Name: Sankalp]

D:\Final Interview\Collection framwork\coding>
*/