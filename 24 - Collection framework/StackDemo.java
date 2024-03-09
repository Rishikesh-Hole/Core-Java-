import java.util.*;
class StackDemo{
	public static void main(String [] args){
		Stack<String> AS = new Stack<String>();
		System.out.println("\nadding elements to Stack using push..");
		AS.push("Rishikesh");
		AS.push("Saylee");
		AS.push("Charvi");
		AS.push("Ronu");
		AS.push("Unknown 1");
		AS.push("Unknown 2");
		
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
			
		System.out.println("\nRemoving elements from statck using pop..");
		AS.pop();
		AS.pop();
		
		System.out.println("\nTraversing using method reference..");
			AS.forEach(System.out::println);

		System.out.println("\nAccessing element from statck using peek.." + AS.peek());
		
		System.out.println("\nChecking for emptyness.." + AS.empty());
		
		System.out.println("\nSeaching for element Charvi.." + AS.search("Charvi"));
		System.out.println("\nChecking for element Shakru.." + AS.search("Shakru"));
		
		
	}
}

/*
D:\Final Interview\Collection framwork\List>java StackDemo.java

adding elements to Stack using push..

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

Removing elements from statck using pop..

Traversing using method reference..
Rishikesh
Saylee
Charvi
Ronu

Accessing element from statck using peek..Ronu

Checking for emptyness..false

Seaching for element Charvi..2

Checking for element Shakru..-1

D:\Final Interview\Collection framwork\List>
*/