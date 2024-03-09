class Example{
	 private Example(){}
	 Example(int a){
		System.out.println("Example no-args constructor ");
	}
}
class Sample extends Example{
	Sample(int a){
		super(10);
		System.out.println("Example no-args constructor ");
	}
}