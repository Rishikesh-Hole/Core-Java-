class SystemGC{
	public static void main(String [] args){
		System.out.println("Before System.gc");
		System.gc();
		System.out.println("After System.gc");
	}
}