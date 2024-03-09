import java.io.*;
class Filedemo{
	public static void main(String [] args) throws Exception{
		File fileName1= new File("Filedemo1.txt");
		File fileName2= new File("Filedemo2.txt");
		File f = new File("test1");
		File fileName3= new File(f, "Filedemo3.txt"); // will create test1/Filedemo3.txt
		File fileName4= new File(f.toURI());
		File fileName5= new File("Filedemo5.txt");
		File fileName6= new File("Filedemo6.txt");
		
		System.out.println("fileName1  - " + fileName1);
		System.out.println("fileName2  - " + fileName2);
		System.out.println("fileName3  - " + fileName3);
		System.out.println("fileName4  - " + fileName4);
		System.out.println(f);
		System.out.println("is fileName1 exists - " + fileName1.exists());
		
		System.out.println("to create file Filedemo2 - " + fileName2.createNewFile());
		
		System.out.println("to create directory - " + f.mkdir());
		
		System.out.println("fileName2 isFile() - " + fileName2.isFile());
		
		
		//System.out.println("t.isDirectory - " + t.isDirectory()); -- looks like for Linux only
		
		System.out.println("fileName2.canRead() - " + fileName2.canRead());
		
		System.out.println("fileName2.canWrite() - " + fileName2.canWrite());
		
		System.out.println("fileName2.isHidden() - " + fileName2.isHidden());
		
		System.out.println("fileName2.length() - " + fileName2.length());
		
		System.out.println("to create file Filedemo6- " + fileName6.createNewFile());
		
		System.out.println("fileName6.setReadOnly() - " + fileName6.setReadOnly());
		
		System.out.println("fileName6.lastModified() - " + fileName6.lastModified());
		
		System.out.println("fileName2.getName() - " + fileName2.getName());
		
		System.out.println("fileName2.getAbsolutePath() - " + fileName2.getAbsolutePath());
		
		//System.out.println("fileName2.renameTo() - " + fileName2.renameTo(fileName3));
		
		System.out.println("fileName2.getName() - " + fileName2.getName());
		
		System.out.println("to create file fileName1 - " + fileName1.createNewFile());
		
		System.out.println("fileName1.delete() - " + fileName1.delete());
		
		System.out.println("fileName1.delete() - " + fileName1.delete());
		
		System.out.println("to create file fileName5 - " + fileName5.createNewFile());
		
		System.out.println("fileName5.deleteOnExit() - " );
		fileName5.deleteOnExit();
		
		System.out.println("fileName1.toString() - " + fileName1.toString());
		
		System.out.println("file object creation with complete file or directory path.");
		File fileName7= new File("D:\\Final Interview\\Core java\\Coding practice\\18 - IOStreams\\Filedemo7.txt");
		
		System.out.println("fileName7.getAbsolutePath() - " + fileName7.getAbsolutePath());
		System.out.println("fileName7.getName() - " + fileName7.getName());
		
		String fs = File.separator;
		
		System.out.println(" File separator demo-");
		File filename8 = new File("D:"+fs+"Final Interview"+fs+"Core java"+fs+"Coding practice"+fs+"18 - IOStreams"+fs+"Filedemo8.txt");
		
		System.out.println("filename8.getAbsolutePath() - " + filename8.getAbsolutePath());
		System.out.println("filename8.getName() - " + filename8.getName());		
	}
}


/*

D:\Final Interview\Core java\Coding practice\18 - IOStreams>java Filedemo.java
fileName1  - Filedemo1.txt
fileName2  - Filedemo2.txt
fileName3  - test1\Filedemo3.txt
fileName4  - D:\Final Interview\Core java\Coding practice\18 - IOStreams\test1
test1
is fileName1 exists - false
to create file Filedemo2 - false
to create directory - false
fileName2 isFile() - true
fileName2.canRead() - true
fileName2.canWrite() - true
fileName2.isHidden() - false
fileName2.length() - 0
to create file Filedemo6- false
fileName6.setReadOnly() - true
fileName6.lastModified() - 1705411944182
fileName2.getName() - Filedemo2.txt
fileName2.getAbsolutePath() - D:\Final Interview\Core java\Coding practice\18 - IOStreams\Filedemo2.txt
fileName2.getName() - Filedemo2.txt
to create file fileName1 - true
fileName1.delete() - true
fileName1.delete() - false
to create file fileName5 - true
fileName5.deleteOnExit() -
fileName1.toString() - Filedemo1.txt
file object creation with complete file or directory path.
fileName7.getAbsolutePath() - D:\Final Interview\Core java\Coding practice\18 - IOStreams\Filedemo7.txt
fileName7.getName() - Filedemo7.txt
 File separator demo-
filename8.getAbsolutePath() - D:\Final Interview\Core java\Coding practice\18 - IOStreams\Filedemo8.txt
filename8.getName() - Filedemo8.txt

D:\Final Interview\Core java\Coding practice\18 - IOStreams>

*/

