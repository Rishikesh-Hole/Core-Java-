import java.util.*;
import java.util.stream.*;
class IntermediateOpsDemo{
	public static void main(String [] args){
		List<String> LS1 = Arrays.asList("Pinaple","Apple","Banana","Cherry","Orange", "Apple","Orange");
		
		Stream<String> filteredStream = LS1.stream().filter(fruit-> fruit.startsWith("A"));
		System.out.println("Printing stream after filter..");
		filteredStream.forEach(System.out::println);
		
		Stream<String> mapStream = LS1.stream().map(String::toUpperCase);
		System.out.println("\nPrinting stream after map..");
		mapStream.forEach(System.out::println);		
		
		/*Stream<String> flatMapStream = LS1.stream().flatMap(s->Arrays.stream(s.split("")));
		System.out.println("\nPrinting stream after flatMap..");
		flatMapStream.forEach(System.out::println);	*/
		
		Stream<String> distinctStream = LS1.stream().distinct();
		System.out.println("\nPrinting stream after distinct..");
		distinctStream.forEach(System.out::println);			
		
		Stream<String> sortedStream = LS1.stream().sorted();
		System.out.println("\nPrinting stream after sorted..");
		sortedStream.forEach(System.out::println);

		Stream<String> limitStream = LS1.stream().limit(2);
		System.out.println("\nPrinting stream after limit..");
		limitStream.forEach(System.out::println);		
		
		Stream<String> skipStream = LS1.stream().skip(2);
		System.out.println("\nPrinting stream after skip..");
		skipStream.forEach(System.out::println);
		
		Stream<String> peekStream = LS1.stream().peek(s->System.out.println("Processign: "+s));
		System.out.println("\nPrinting stream after peek..");
		peekStream.forEach(System.out::println);	

		Stream<String> startsWithmapStream = LS1.stream()
														.filter(fruit-> fruit.contains("r"))
														.map(String::toUpperCase)
														.distinct()
														.sorted()
														.peek(s->System.out.println("Processign: "+s))
														.limit(1);
		System.out.println("\nPrinting stream after map..");
		startsWithmapStream.forEach(System.out::println);	
		
	}
}


/*

D:\Final Interview\Collection framwork\Stream API>java IntermediateOpsDemo.java
Printing stream after filter..
Apple
Apple

Printing stream after map..
PINAPLE
APPLE
BANANA
CHERRY
ORANGE
APPLE
ORANGE

Printing stream after distinct..
Pinaple
Apple
Banana
Cherry
Orange

Printing stream after sorted..
Apple
Apple
Banana
Cherry
Orange
Orange
Pinaple

Printing stream after limit..
Pinaple
Apple

Printing stream after skip..
Banana
Cherry
Orange
Apple
Orange

Printing stream after peek..
Processign: Pinaple
Pinaple
Processign: Apple
Apple
Processign: Banana
Banana
Processign: Cherry
Cherry
Processign: Orange
Orange
Processign: Apple
Apple
Processign: Orange
Orange

Printing stream after map..
Processign: CHERRY
CHERRY

D:\Final Interview\Collection framwork\Stream API>
*/