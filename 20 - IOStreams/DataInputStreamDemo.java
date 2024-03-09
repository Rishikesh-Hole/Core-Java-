import java.io.*;

class DataInputStreamDemo
{
	public static void main(String [] args) throws FileNotFoundException, IOException{
		FileInputStream fis = new FileInputStream("DataOutputStreamDemo.txt");
		DataInputStream DOS = new DataInputStream(fis);
		
		for (int i=0; i<5;i++){
			System.out.println(DOS.readInt());
		}
	
		
		for (int i=100; i<105;i++){
			System.out.println(DOS.readChar());
			System.out.println(DOS.readInt());
			System.out.println(DOS.readChar());
		}
		DOS.close(); 
		fis = new FileInputStream("test.txt");
	}
}

