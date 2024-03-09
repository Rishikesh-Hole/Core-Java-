class DataTypeDemo{
	static byte classLevelByte;
	static short classLevelShort;
	static int classLevelInt;
	static long classLevelLong;
	static double classLevelDouble;
	static float classLevelFloat;
	static char classLevelChar;
	static boolean classLevelBoolean;
	
	
	public static void main(String [] args){
			byte localByte;
			short localShort;
			int localInt;
			long localLong;
			double localDouble;
			float localFloat;
			char localChar;
			boolean localBoolean;
			
			/*System.out.println("localByte - " + localByte);  // error: variable localByte might not have been initialized
			System.out.println("localShort - " + localShort);
			System.out.println("localInt - " + localInt);
			System.out.println("localLong - " + localLong);
			System.out.println("localDouble - " + localDouble);
			System.out.println("localFloat - " + localFloat);
			System.out.println("localChar - " + localChar);
			System.out.println("localBoolean - " + localBoolean);*/
			
			//byte localByte =10; error: variable localByte is already defined in method main(String[])
			 localByte =10;
			 localShort=10;
			 localInt=10;
			 localLong=10;
			 localDouble=10;
			 localFloat=10;
			 localChar='a';
			 localBoolean=true;
			
			System.out.println("localByte - " + localByte);
			System.out.println("localShort - " + localShort);
			System.out.println("localInt - " + localInt);
			System.out.println("localLong - " + localLong);
			System.out.println("localDouble - " + localDouble);
			System.out.println("localFloat - " + localFloat);
			System.out.println("localChar - " + localChar);
			System.out.println("localBoolean - " + localBoolean);
			
			System.out.println("classLevelByte - " + classLevelByte);
			System.out.println("classLevelShort - " + classLevelShort);
			System.out.println("classLevelInt - " + classLevelInt);
			System.out.println("classLevelLong - " + classLevelLong);
			System.out.println("classLevelDouble - " + classLevelDouble);
			System.out.println("classLevelFloat - " + classLevelFloat);
			System.out.println("classLevelChar -" + classLevelChar +"-");
			System.out.println("classLevelBoolean - " + classLevelBoolean);			
			
			
	}
}


/*
## WIthout Initialization of local varibales


D:\Final Interview\Core java\Coding practice\3 - Operators>java DataTypeDemo.java
DataTypeDemo.java:22: error: variable localByte might not have been initialized
                        System.out.println("localByte - " + localByte);
                                                            ^
DataTypeDemo.java:23: error: variable localShort might not have been initialized
                        System.out.println("localShort - " + localShort);
                                                             ^
DataTypeDemo.java:24: error: variable localInt might not have been initialized
                        System.out.println("localInt - " + localInt);
                                                           ^
DataTypeDemo.java:25: error: variable localLong might not have been initialized
                        System.out.println("localLong - " + localLong);
                                                            ^
DataTypeDemo.java:26: error: variable localDouble might not have been initialized
                        System.out.println("localDouble - " + localDouble);
                                                              ^
DataTypeDemo.java:27: error: variable localFloat might not have been initialized
                        System.out.println("localFloat - " + localFloat);
                                                             ^
DataTypeDemo.java:28: error: variable localChar might not have been initialized
                        System.out.println("localChar - " + localChar);
                                                            ^
DataTypeDemo.java:29: error: variable localBoolean might not have been initialized
                        System.out.println("localBoolean - " + localBoolean);
                                                               ^
8 errors
error: compilation failed

D:\Final Interview\Core java\Coding practice\3 - Operators>


*/


/*
D:\Final Interview\Core java\Coding practice\3 - Operators>java DataTypeDemo.java
localByte - 10
localShort - 10
localInt - 10
localLong - 10
localDouble - 10.0
localFloat - 10.0
localChar - a
localBoolean - true
classLevelByte - 0
classLevelShort - 0
classLevelInt - 0
classLevelLong - 0
classLevelDouble - 0.0
classLevelFloat - 0.0
classLevelChar - -
classLevelBoolean - false

D:\Final Interview\Core java\Coding practice\3 - Operators>
*/
