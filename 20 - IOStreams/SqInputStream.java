import java.io.*;
class SqInputStream{
	public static void main(String [] args) throws FileNotFoundException, IOException{
		FileInputStream FI1 = new FileInputStream("SqInputStream1.txt");
		FileInputStream FI2 = new FileInputStream("SqInputStream2.txt");
		
		SequenceInputStream SI = new SequenceInputStream(FI1, FI2);
		
		int data;

		while(SI.read() != -1){
			System.out.println(" Data read - "+(char)SI.read());
		}
		
		
	}
}


/*
D:\Final Interview\Core java\Coding practice\18 - IOStreams>java SqInputStream.java
 Data read - B
 Data read - X
 Data read - Z

D:\Final Interview\Core java\Coding practice\18 - IOStreams>java SqInputStream.java
*/