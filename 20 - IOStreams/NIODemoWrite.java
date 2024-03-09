import java.nio.file.*;
import java.io.*;
import java.util.stream.Stream;
import java.nio.charset.*;
import java.util.*;

class NIODemoWrite{
	public static void main(String [] args) throws IOException{
		String fileSeparator = FileSystems.getDefault().getSeparator();
		Path filePath = Paths.get("D:"+fileSeparator+"Final Interview"+fileSeparator+"Core java"+fileSeparator+"Java IO"+fileSeparator+"18 - IOStreams"+fileSeparator+"NIODemoWRITE.txt");
		
		if (Files.exists(filePath)){
			System.out.println(filePath.toString()+" - Already exists. ");
		}
		else{
			Files.createFile(filePath);
		}
		
		System.out.println("Writing bytes...");
		byte[] byteContent = "\nHello Rishikesh, this is byte contents!!".getBytes();
		Files.write(filePath, byteContent,StandardOpenOption.APPEND);
		Files.write(filePath,"\n".getBytes(),StandardOpenOption.APPEND);
		
		System.out.println("Writing character lines...");
		List<String> lines = Arrays.asList("\nHello Rishikesh, these are character lines..", "Line 1","Line 2","Line 3","Line 4", "\n");
		Files.write(filePath, lines,StandardCharsets.UTF_8,StandardOpenOption.APPEND);
		
		System.out.println("Writing using BufferedWriter lines...");
		try(BufferedWriter BW = Files.newBufferedWriter(filePath,StandardCharsets.UTF_8,StandardOpenOption.APPEND)){
			BW.write("Hello Rishikesh, I am writing using BufferedWriter.");
		}
		catch(IOException ie){
			
		}
	}
}

/*
D:\Final Interview\Core java\Java IO\18 - IOStreams>java NIODemoWrite.java
D:\Final Interview\Core java\Java IO\18 - IOStreams\NIODemoWRITE.txt - Already exists.
Writing bytes...
Writing character lines...
Writing using BufferedWriter lines...

D:\Final Interview\Core java\Java IO\18 - IOStreams>

file contents-

Hello Rishikesh, this is byte contents!!

Hello Rishikesh, these are character lines..
Line 1
Line 2
Line 3
Line 4


Hello Rishikesh, I am writing using BufferedWriter.

*/