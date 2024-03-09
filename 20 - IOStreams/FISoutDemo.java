import java.io.*;

class FISoutDemo
{
	public static void main(String [] args) throws FileNotFoundException, IOException{
		FileOutputStream fis = new FileOutputStream("FISoutTest.txt", true); // append mode is true
		
		for (int i=0; i<5;i++){
			fis.write(i);
		}
		fis.write('a');
		fis.write('b');
		fis.write(99);
		
		
		for (int i=100; i<105;i++){
			fis.write(i);
		}
		fis.close(); 
	}
}