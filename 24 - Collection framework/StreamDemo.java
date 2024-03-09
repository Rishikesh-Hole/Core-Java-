import java.util.*;
import java.util.stream.*;
class StreamDemo{
	public static void main(String [] args){
		List<String> LS1 = Arrays.asList("Apple","Banana","Cherry");
		Stream<String> SM1 = LS1.stream();
		System.out.println("Collection stream..");
		SM1.forEach(System.out::println);
		
		String[] stringArray = {"Apple","Banana","Cherry"};
		Stream<String> SM2 = Arrays.stream(stringArray);
		System.out.println("\nArray Stream..");
		SM2.forEach(System.out::println);
		
		Stream<String> SM3 = Stream.of("Apple","Banana","Cherry");
		System.out.println("\nStream.of() stream..");
		SM3.forEach(System.out::println);
		
		IntStream ISM = IntStream.range(1,7);
		System.out.println("\nIntStream.range(1,7)");
		ISM.forEach(System.out::println);
		
	}
}

/*
D:\Final Interview\Collection framwork\Stream API>java StreamDemo.java
Collection stream..
Apple
Banana
Cherry

Array Stream..
Apple
Banana
Cherry

Stream.of() stream..
Apple
Banana
Cherry

IntStream.range(1,7)
1
2
3
4
5
6

D:\Final Interview\Collection framwork\Stream API>
*/