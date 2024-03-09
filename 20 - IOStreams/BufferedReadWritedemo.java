import java.io.*;
class BufferedReadWritedemo{
	public static void main(String [] args) throws Exception{
		File fileName= new File("BufferedReadWritedemo.txt");
		BufferedWriter BW = new BufferedWriter(new FileWriter(fileName,true));
		for (int i=11; i<21; i++){
			String S = "String - "+i;
			BW.append(S);
			BW.newLine();
			}
		BW.flush();
		BW.close();
		
		BufferedReader BR = new BufferedReader(new FileReader(fileName));
		String line;
		while((line=BR.readLine())!=null){
			System.out.println("Read --> " + line);
			
		}
		BR.close();
		
	}
}

/*
File BufferedReadWritedemo.txt was not present when I executed program first time.
file generated
D:\Final Interview\Core java\Coding practice\18 - IOStreams>java BufferedReadWritedemo.java
Read --> String - 11
Read --> String - 12
Read --> String - 13
Read --> String - 14
Read --> String - 15
Read --> String - 16
Read --> String - 17
Read --> String - 18
Read --> String - 19
Read --> String - 20

D:\Final Interview\Core java\Coding practice\18 - IOStreams>


D:\Final Interview\Core java\Coding practice\18 - IOStreams>java BufferedReadWritedemo.java
Read --> String - 11
Read --> String - 12
Read --> String - 13
Read --> String - 14
Read --> String - 15
Read --> String - 16
Read --> String - 17
Read --> String - 18
Read --> String - 19
Read --> String - 20
Read --> String - 11
Read --> String - 12
Read --> String - 13
Read --> String - 14
Read --> String - 15
Read --> String - 16
Read --> String - 17
Read --> String - 18
Read --> String - 19
Read --> String - 20

D:\Final Interview\Core java\Coding practice\18 - IOStreams>

*/