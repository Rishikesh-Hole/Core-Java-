import java.util.*;
import java.util.stream.*;

class TerminalOpsDemo{
	public static void main(String [] args){
		List<String> LS1 = Arrays.asList("Pinaple","Apple","Banana","Cherry","Orange", "Apple","Orange");
		
		Stream<String> filteredStream = LS1.stream().filter(fruit-> fruit.startsWith("A"));
		System.out.println("Printing stream using forEach Terminal operation..");
		filteredStream.forEach(System.out::println);
		
		Stream<String> mapStream = LS1.stream().map(String::toUpperCase);
		String []mapStreamString = mapStream.toArray(String[]::new);
		System.out.println("Printing string after converting stream to string using toArray Terminal operation..");
		for(String item:mapStreamString){
			System.out.println(item);
		}
				
		//System.out.println("Terminal operation count(): "+filteredStream.count()); //Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed. We can't use same stream again for another terminal operation once we are done with a terminal operation.
		
		System.out.println("Terminal operation count(): "+LS1.stream().count());
		
		Stream<String> distinctStream = LS1.stream().distinct();
		System.out.println("\nPrinting stream after distinct..");
		distinctStream.forEach(System.out::println);			
		
		Stream<String> parasortedStream = LS1.parallelStream().sorted();
		System.out.println("\nPrinting parallel stream after sorted..");
		parasortedStream.forEach(System.out::println);
		
		Stream<String> sortedStream = LS1.stream().sorted();
		System.out.println("\nPrinting from normal stream after sorted..");
		sortedStream.forEach(System.out::println);		

		Stream<Integer> IntStream = Stream.of(11,32,3,14,5);
		System.out.println("\nUsing min terminal method: " + IntStream.min(Integer::compareTo));
		//System.out.println("\nUsing min terminal method: " + IntStream.max(Integer::compareTo)); //java.lang.IllegalStateException: stream has already been operated upon or closed
		System.out.println("\nUsing min terminal method: " + (Stream.of(11,32,3,14,5)).max(Integer::compareTo));
		
		Stream<String> collectCounting = LS1.stream();
		long count = collectCounting.count();
		System.out.println("\nUsing count terminal method");		
		System.out.println("Stream element count is: " + count);
		
		System.out.println("\nUsing Collectors couting method and collect terminal method");	
		long count1 = LS1.stream().collect(Collectors.counting());
		System.out.println("Stream element count is: " + count1);
		
		System.out.println("\nUsing Collectors joining method and collect terminal method");	
		String str = LS1.stream().collect(Collectors.joining(",","[","]"));
		System.out.println("Stream element count is: " + str);
		
		System.out.println("\nUsing Collectors toSet method and collect terminal method");
		Set<String> set = LS1.stream().collect(Collectors.toSet());
		set.forEach(System.out::println);
		
		System.out.println("\nUsing Collectors toList method and collect terminal method");
		List<String> list = LS1.stream().collect(Collectors.toList());
		set.forEach(System.out::println);
		
		System.out.println("\nUsing Optional and findFirst terminal method");
		Optional<String> findfirst = LS1.stream().findFirst();
		Optional<String> findany = LS1.stream().findAny();
		
		System.out.println("findFirst() : "+findfirst.get());
		System.out.println("findAny() : "+findany.get());
		
		System.out.println("findFirst() : "+findfirst);
		System.out.println("findAny() : "+findany);
	}
}

/*

D:\Final Interview\Collection framwork\Stream API>java TerminalOpsDemo.java
Printing stream using forEach Terminal operation..
Apple
Apple
Printing string after converting stream to string using toArray Terminal operation..
PINAPLE
APPLE
BANANA
CHERRY
ORANGE
APPLE
ORANGE
Terminal operation count(): 7

Printing stream after distinct..
Pinaple
Apple
Banana
Cherry
Orange

Printing parallel stream after sorted..
Orange
Cherry
Apple
Pinaple
Orange
Apple
Banana

Printing from normal stream after sorted..
Apple
Apple
Banana
Cherry
Orange
Orange
Pinaple

Using min terminal method: Optional[3]

Using min terminal method: Optional[32]

Using count terminal method
Stream element count is: 7

Using Collectors couting method and collect terminal method
Stream element count is: 7

Using Collectors joining method and collect terminal method
Stream element count is: [Pinaple,Apple,Banana,Cherry,Orange,Apple,Orange]

Using Collectors toSet method and collect terminal method
Apple
Cherry
Pinaple
Orange
Banana

Using Collectors toList method and collect terminal method
Apple
Cherry
Pinaple
Orange
Banana

Using Optional and findFirst terminal method
findFirst() : Pinaple
findAny() : Pinaple
findFirst() : Optional[Pinaple]
findAny() : Optional[Pinaple]

D:\Final Interview\Collection framwork\Stream API>


*/