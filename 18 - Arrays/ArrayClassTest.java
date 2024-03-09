import java.util.Arrays;
class ArrayClassTest{
	public static void main(String [] args){
		int [] numbers ={10,20,30,1,7,-120,-25,87,45};
		int [] numbers2 ={10,20,30,1};
		// Converting array to String
		String arrayString = Arrays.toString(numbers);
		System.out.println("Original Array (numbers): " + arrayString);
		System.out.println("Original Array (numbers2): " + arrayString);
		
		//Sorting array
		Arrays.sort(numbers);
		System.out.println("\nSorted Array: " + Arrays.toString(numbers));
		
		//Searching an element in array
		System.out.println("\nIndex of -25 : " + Arrays.binarySearch(numbers, -25));
		
		// Array copy
		int[] numbersCopyPart = Arrays.copyOf(numbers,6);  // copying first 6 elements only
		System.out.println("\nPartial Copied Array: " + Arrays.toString(numbersCopyPart));
		
		int[] numbersCopyFull = Arrays.copyOf(numbers,numbers.length);  // full copy
		System.out.println("Full Copied Array: " + Arrays.toString(numbersCopyFull));
		
		int[] numbersCopyCustom = Arrays.copyOfRange(numbers,2, 7);  // custom copy
		System.out.println("Custom (2 to 7 ) Copied Array: " + Arrays.toString(numbersCopyCustom));
		
		// Comparing Arrays
		System.out.println("\nComparing numbers and numbersCopyPart: " + Arrays.equals(numbers, numbersCopyFull));
		System.out.println("Comparing numbers and numbers2: " + Arrays.equals(numbers, numbers2));
		
		// Hashcode of arrays
		System.out.println("\n Array Hashcode-");
		System.out.println(numbersCopyFull);
		System.out.println(numbers);
		
	}
}