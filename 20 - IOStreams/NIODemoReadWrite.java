import java.nio.file.*;
import java.io.*;
import java.util.stream.Stream;
import java.nio.charset.*;
import java.util.*;

class NIODemoRead{
	public static void main(String [] args) throws IOException{
		String fileSeparator = FileSystems.getDefault().getSeparator();
		Path path = Paths.get("D:"+fileSeparator+"Final Interview"+fileSeparator+"Core java"+fileSeparator+"Java IO"+fileSeparator+"18 - IOStreams"+fileSeparator+"NIODemoREADWRITE.txt");
		
		if (Files.exists(path)){
			System.out.println(path.toString()+" - Already exists. ");
		}
		else{
			Files.createFile(path);
		}
		
		System.out.println("Reading All Lines using Files.readAllLines()..");
		List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
		
		for(String line:lines){
			System.out.println(line);
		}
		//lines.forEach(System.out::println);  // we can use this as well
		System.out.println("\nReading bytes using Files.readAllBytes()..");
		
		byte[] fileBytes = Files.readAllBytes(path);
		
		for(byte line:fileBytes){
			System.out.print(line+ " ~ ");
		}
		
		System.out.println("\n\nReading with Stream using Files.lines()..");
		Stream<String> Streamlines = Files.lines(path, StandardCharsets.UTF_8);
			
			Streamlines.forEach(System.out::println);
		
		System.out.println("\nReading Reading a Single Line using Files.newBufferedReader()..");
		try(BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8)){
		String line;
		while((line=reader.readLine())!=null){
			System.out.println(line);
		}
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}


/*

D:\Final Interview\Core java\Java IO\18 - IOStreams>java NIODemoReadWrite.java
D:\Final Interview\Core java\Java IO\18 - IOStreams\NIODemoREADWRITE.txt - Already exists.
Reading All Lines using Files.readAllLines()..
ABC
PQR
XYZ
123
999
888

Reading bytes using Files.readAllBytes()..
65 ~ 66 ~ 67 ~ 13 ~ 10 ~ 80 ~ 81 ~ 82 ~ 13 ~ 10 ~ 88 ~ 89 ~ 90 ~ 13 ~ 10 ~ 49 ~ 50 ~ 51 ~ 13 ~ 10 ~ 57 ~ 57 ~ 57 ~ 13 ~ 10 ~ 56 ~ 56 ~ 56 ~

Reading with Stream using Files.lines()..
ABC
PQR
XYZ
123
999
888

Reading Reading a Single Line using Files.newBufferedReader()..
ABC
PQR
XYZ
123
999
888

D:\Final Interview\Core java\Java IO\18 - IOStreams>

*/