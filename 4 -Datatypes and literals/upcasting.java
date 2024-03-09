class Parent{
	public void m1(){
		System.out.println("I am in Parent - m1 !! ");
	}
}

class Child1 extends Parent{
	public void m1(){
		System.out.println("I am in Child1 - m1 !! ");
	}
	public void m2(){
		System.out.println("I am in Child1 - m2 !! ");
	}
}

class Child2 extends Parent{
	public void m1(){
		System.out.println("I am in Child2 - m1 !! ");
	}
	public void m3(){
		System.out.println("I am in Child2 - m3 !! ");
	}
}

class GrandDaughter extends Child1{
	public void m1(){
		System.out.println("I am in GrandDaughter - m1 !! ");
	}
	public void m4(){
		System.out.println("I am in GrandDaughter - m4 !! ");
	}
}

class GrandSon extends Child2{
	public void m3(){
		System.out.println("I am in GrandSon - m3 !! ");
	}
	public void m5(){
		System.out.println("I am in GrandSon - m3 !! ");
	}
}

class MainClass{
	public static void main(String[] args){
		Parent P1 = new Parent();
		P1.m1();
		Parent P2 = new GrandDaughter(); // upcasting
		P2.m1();
		//P2.m4(); upcasting.java:49: error: cannot find symbol
		
		GrandDaughter G1 = (GrandDaughter) P2; // Downcasting
		G1.m4();
		
		((GrandDaughter) P2).m4(); // Downcasting
		
	}
}


/*

D:\Final Interview\Core java\Coding practice\4 -Datatypes and literals>javac upcasting.java

D:\Final Interview\Core java\Coding practice\4 -Datatypes and literals>java MainClass
I am in Parent - m1 !!
I am in GrandDaughter - m1 !!
I am in GrandDaughter - m4 !!
I am in GrandDaughter - m4 !!

D:\Final Interview\Core java\Coding practice\4 -Datatypes and literals>

*/