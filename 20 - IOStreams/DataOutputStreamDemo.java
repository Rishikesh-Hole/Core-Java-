import java.io.*;

class DataOutputStreamDemo
{
	public static void main(String [] args) throws FileNotFoundException, IOException{
		FileOutputStream fis = new FileOutputStream("DataOutputStreamDemo.txt", true); // append mode is true
		DataOutputStream DOS = new DataOutputStream(fis);
		
		for (int i=0; i<5;i++){
			DOS.writeInt(i);
		}
		DOS.write('a');
		DOS.write('b');
		DOS.write(99);
		
		
		for (int i=100; i<105;i++){
			DOS.writeChar(i);
			DOS.writeInt(i);
			DOS.writeChar((char)i);
		}
		DOS.close(); 
	}
}
