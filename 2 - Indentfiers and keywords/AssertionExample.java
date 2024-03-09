class AssertionExample{
	public static void main(String [] args)
	{
		int age =20;
		assert age>0 : "Age should be positive !!";
		
		System.out.println("Age is " + age);
		CheckEvenNumber(age);
	}
	static void CheckEvenNumber(int number){
		assert number%2==0 : "Number is even";
		
		System.out.println(number + "Age is even!!");
	}
}

/*


D:\Final Interview\Core java\Coding practice\2 - Indentfiers and keywords>java AssertionExample.java
Age is 20
20Age is even!!

D:\Final Interview\Core java\Coding practice\2 - Indentfiers and keywords>
D:\Final Interview\Core java\Coding practice\2 - Indentfiers and keywords>




D:\Final Interview\Core java\Coding practice\2 - Indentfiers and keywords>java -ea AssertionExample.java
Age is 20
20Age is even!!

D:\Final Interview\Core java\Coding practice\2 - Indentfiers and keywords>
D:\Final Interview\Core java\Coding practice\2 - Indentfiers and keywords>



*/