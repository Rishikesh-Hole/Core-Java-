class excpetionTest1{
	public static void main(String [] args){
		
		System.out.println(add());

	}
	static int add(){
		try{
		
		try{
			System.out.println("In try ");
			System.out.println(10/0);
		}
		
		catch(NullPointerException ae)
		{
			System.out.println("In NullPointerException ");
			System.out.println("====================");
			
			//ae.printStackTrace();
			System.out.println("====================");
			
			System.out.println(ae.getMessage());
			System.out.println("====================");
			
			System.out.println(ae.toString());
			System.out.println("====================");
			//return 20;
			
		}		
		finally
		{
			System.out.println("In inner finally Block");
			return 20;
			
		}
		
		
		}
		
		finally{
			System.out.println("In outer finally Block");
			
			
		}

	}
}

