class StringReverse{
	static String stringReverse(String s){
		String[] sTemp = s.split(" ");
		StringBuffer SB = new StringBuffer();
		
		for(int i=sTemp.length-1; i>=0; i--){
			SB.append(sTemp[i]+" ");
		}
		
		return SB.toString().trim();
	}
	
	public static void main(String [] args){
		String s = "Rishikesh Digambar Hole";
		System.out.println("Original String: " + s);
		
		System.out.println("Reversed String: " + stringReverse(s));
	}
}

/*

D:\Final Interview\Core java\Coding practice\17 - Strings>java StringReverse.java
Original String: Rishikesh Digambar Hole
Reversed String: Hole Digambar Rishikesh

D:\Final Interview\Core java\Coding practice\17 - Strings>

*/