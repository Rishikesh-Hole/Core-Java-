class MainMethodOverloading{
	public static void main(String[] args)
	{
		System.out.println("in String[] args main method !!");
		MainMethodOverloading.main(new int[0]);
		MainMethodOverloading.main("Hello");
	}
	public static void main(int[] args)
	{
		System.out.println("in int[] args main method !!");
	}
	public static void main(String args)
	{
		System.out.println("in String args main method !!");
	}	
}

/*

D:\Final Interview\Core java\Coding practice\1 - Intro to java>java MainMethodOverloading.java
in String[] args main method !!

D:\Final Interview\Core java\Coding practice\1 - Intro to java>

## added -
		MainMethodOverloading.main(new int[0]);
		MainMethodOverloading.main("Hello");
		
		
		
		
D:\Final Interview\Core java\Coding practice\1 - Intro to java>java MainMethodOverloading.java
in String[] args main method !!
in int[] args main method !!
in String args main method !!

D:\Final Interview\Core java\Coding practice\1 - Intro to java>
D:\Final Interview\Core java\Coding practice\1 - Intro to java>


*/
