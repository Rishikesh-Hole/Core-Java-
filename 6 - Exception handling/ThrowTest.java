class ThrowTest{
	public static void main(String [] args) throws InterruptedException, ArithmeticException{
		m1();
		m2();
	}
	
	static void m1() throws ArithmeticException{
		System.out.println("In m1()");
		//throw new ArithmeticException();
	}
	
	static void m2() throws InterruptedException{
		System.out.println("In m2()");
		throw new InterruptedException();
		
		}
}

