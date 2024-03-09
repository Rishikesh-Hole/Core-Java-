import java.util.*;
class collectionMethods{
	public static void main(String [] args){
		//List<String> LS = Arrays.asList("Apple", "Banana","Orange");Exception in thread "main" java.lang.UnsupportedOperationException: remove
		
		List<String> LS = new ArrayList<String>();
		LS.add("Apple");
		LS.add("Banana");
		LS.add("Orange");
		LS.add("Mango");
		System.out.println("Before removeIf-");
		LS.forEach(System.out::println);
		
		System.out.println("\nAfter removeIf(s->s==Apple)");
		LS.removeIf(s->s=="Apple");
		LS.forEach(System.out::println);
		
		System.out.println("copyOf of List");
		List<String> LS1= List.of("Apple", "Banana","Orange"); 
		//LS1.add("Mango"); //Immutable
		List<String> CopiedList = List.copyOf(LS1);
		//CopiedList.add("Per"); // Immutable - Exception in thread "main" java.lang.UnsupportedOperationException
		CopiedList.forEach(System.out::println);
		
		System.out.println("copyOf of set");
		Set<String> sep1= Set.of("Apple", "Banana","Orange"); 
		//sep1.add("Mango"); //Immutable
		Set<String> CopiedSet = Set.copyOf(sep1);
		//CopiedSet.add("Santra"); // Immutable - Exception in thread "main" java.lang.UnsupportedOperationException
		CopiedSet.forEach(System.out::println);
		
		System.out.println("copyOf of map");
		Map<String, Integer> map1= Map.of("Apple",1, "Banana",2,"Orange",3); 
		
		Map<String, Integer> map2= Map.ofEntries(Map.entry("Apple",1), Map.entry("Banana",2),Map.entry("Orange",3)); 
		
		Map<String, Integer> copiedmap2 =Map.copyOf(map2);
		//copiedmap2.put("Apple",1); // Immutable - Exception in thread "main" java.lang.UnsupportedOperationException
		copiedmap2.forEach((key, value)->System.out.println("Key: "+key+" Value: "+ value));
		
	} 
}