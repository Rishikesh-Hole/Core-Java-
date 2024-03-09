import java.util.*;

class MyClass implements Comparable<MyClass>{
	int studId;
	String studName;
	MyClass(int studId, String studName){
		this.studId = studId;
		this.studName = studName;
	}
	
	public String toString(){
		return "[ Studen ID: "+studId+" Name: "+studName+"]";
	}
	
	public int compareTo(MyClass M){ 
		return Integer.compare(this.studId, M.studId);
	}
	public static void main(String [] args){
		TreeSet<MyClass> TS = new TreeSet<MyClass>();
		TS.add(new MyClass(101, "Rishikesh"));
		TS.add(new MyClass(103, "Ankit"));
		TS.add(new MyClass(102, "Karan"));
		TS.add(new MyClass(110, "Sankalp"));
		TS.add(new MyClass(110, "Sankalp"));
		
		TS.forEach(System.out::println);
		
	}
}

/*
D:\Final Interview\Collection framwork\coding>java MyClassComparable.java
[ Studen ID: 101 Name: Rishikesh]
[ Studen ID: 102 Name: Karan]
[ Studen ID: 103 Name: Ankit]
[ Studen ID: 110 Name: Sankalp]

D:\Final Interview\Collection framwork\coding>
*/