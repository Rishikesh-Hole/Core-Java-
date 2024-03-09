import java.util.*;
class ArrayListDemo{
	public static void main(String [] args){
		ArrayList<String> AS = new ArrayList<String>();
		//List<String> AS = new ArrayList<String>(); // Valid
		//ArrayList<String> AS = new ArrayList<String>(5); // we can have default size as well
		AS.add("Rishikesh");
		AS.add("Saylee");
		AS.add("Charvi");
		AS.add("Ronu");
		AS.add("Unknown 1");
		AS.add("Unknown 2");
		
		System.out.println("\nTraversing using Iterator..");
		Iterator<String> iterator = AS.iterator();
		while(iterator.hasNext()){
			System.out.println("Family member - " + iterator.next());
		}
		System.out.println("\nTraversing using advanced for loop..");
		for (String member:AS){
			System.out.println("Family member - "+member);
		}
		System.out.println("\nTraversing using method reference..");
			AS.forEach(System.out::println);
		
		System.out.println("\nRemoving Unknown 1 and 2..");
		AS.remove("Unknown 1");
		AS.remove(AS.size()-1);
		
		System.out.println("\nTraversing using method reference..");
		AS.forEach(System.out::println);
		
		System.out.println("ArrayList size - "+AS.size());
		AS.trimToSize(); // this is ArrayList class method only.
		
		AS.add("Ronu");
		
		System.out.println("\nChecking and Searching - ");
		System.out.println("AS.contains(Ronu) - "+AS.contains("Ronu"));
		System.out.println("AS.indexOf(Ronu) - "+AS.indexOf("Ronu"));
		System.out.println("AS.lastIndexOf(Ronu) - "+AS.lastIndexOf("Ronu"));
		
		System.out.println("\nAccessing elements - ");
		System.out.println("AS.get(0) - "+AS.get(0));
		System.out.println("AS.set(s, Shakaru) - "+AS.set(4,"Shakaru"));
		
		System.out.println("\nTraversing using method reference..");
		AS.forEach(System.out::println);
		
	}
}

/*
D:\Final Interview\Collection framwork\List>java ArrayListDemo.java

Traversing using Iterator..
Family member - Rishikesh
Family member - Saylee
Family member - Charvi
Family member - Ronu
Family member - Unknown 1
Family member - Unknown 2

Traversing using advanced for loop..
Family member - Rishikesh
Family member - Saylee
Family member - Charvi
Family member - Ronu
Family member - Unknown 1
Family member - Unknown 2

Traversing using method reference..
Rishikesh
Saylee
Charvi
Ronu
Unknown 1
Unknown 2

Removing Unknown 1 and 2..

Traversing using method reference..
Rishikesh
Saylee
Charvi
Ronu
ArrayList size - 4

Checking and Searching -
AS.contains(Ronu) - true
AS.indexOf(Ronu) - 3
AS.lastIndexOf(Ronu) - 4

Accessing elements -
AS.get(0) - Rishikesh
AS.set(s, Shakaru) - Ronu

Traversing using method reference..
Rishikesh
Saylee
Charvi
Ronu
Shakaru

D:\Final Interview\Collection framwork\List>
*/