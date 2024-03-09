import java.io.*;

class FISDemo
{
	public static void main(String [] args) throws FileNotFoundException, IOException{
		FileInputStream fis = new FileInputStream("test.txt");
		
		int j;
		while((j=fis.read())!=-1){
			System.out.println(j + "...");
			System.out.println((char)j);
			//System.out.print((char)j);
		}
		fis.close();
	}
}

/*

D:\Final Interview\Core java\Coding practice\18 - IOStreams>java FISDemo.java
72...
H
105...
i
32...

82...
R
105...
i
115...
s
104...
h
105...
i
107...
k
101...
e
115...
s
104...
h

*/