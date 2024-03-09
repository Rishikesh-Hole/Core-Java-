class WrapperClassTest2{
	public static void main(String [] args){
		short s1=10;
		int i1= 10;
		byte b1 = 10;
		long l1=10;
		
		float f1=10;
		double d1=10;
		
		char c1 = 'a';
		boolean bl =true;
		
		// valueOf(Primitive data type)
		Byte bo1= Byte.valueOf(b1);
		Short so1= Short.valueOf(s1);
		Integer io1= Integer.valueOf(i1);
		Long lo1= Long.valueOf(l1);
		
		Float fo1= Float.valueOf(f1);
		Double do1= Double.valueOf(d1);
		
		Boolean blo1= Boolean.valueOf(bl);
		Character co1= Character.valueOf(c1);
		
		System.out.println("Byte.valueOf(Primitive data type) - " + bo1);
		System.out.println("Short.valueOf(Primitive data type) - " + so1);
		System.out.println("Integer.valueOf(Primitive data type) - " + io1);
		System.out.println("Long.valueOf(Primitive data type) - " + lo1);
		
		System.out.println("Float.valueOf(Primitive data type) - " + fo1);
		System.out.println("Double.valueOf(Primitive data type) - " + do1);
		
		System.out.println("Boolean.valueOf(Primitive data type) - " + blo1);
		System.out.println("Character.valueOf(Primitive data type) - " + co1);
		
		System.out.println("===================================================");
		
		// valueOf(String)
		 bo1= Byte.valueOf("20");
		 so1= Short.valueOf("20");
		 io1= Integer.valueOf("20");
		 lo1= Long.valueOf("20");
		
		 fo1= Float.valueOf("20.0");
		 do1= Double.valueOf("20.0");
		
		 blo1= Boolean.valueOf("false");
		//Character co1= Character.valueOf("20"); java:47: error: method valueOf in class Character cannot be applied to given types
		
		System.out.println("Byte.valueOf(String) - " + bo1);
		System.out.println("Short.valueOf(String) - " + so1);
		System.out.println("Integer.valueOf(String) - " + io1);
		System.out.println("Long.valueOf(String) - " + lo1);
		
		System.out.println("Float.valueOf(String) - " + fo1);
		System.out.println("Double.valueOf(String) - " + do1);
		
		System.out.println("Boolean.valueOf(String) - " + blo1);
		
		//xxxValue()
		System.out.println("Byte.valueOf(String) - " + bo1);
		System.out.println("Short.valueOf(String) - " + so1);
		System.out.println("Integer.valueOf(String) - " + io1);
		System.out.println("Long.valueOf(String) - " + lo1);
		
		System.out.println("Float.valueOf(String) - " + fo1);
		System.out.println("Double.valueOf(String) - " + do1);
		
		System.out.println("Boolean.valueOf(String) - " + blo1);
		
	}
}
