import java.nio.file.*;
import java.io.*;

class NIODemo1{
	public static void main(String [] args) throws IOException{
		String fileSeparator = FileSystems.getDefault().getSeparator();
		Path path = Paths.get("D:"+fileSeparator+"Final Interview"+fileSeparator+"Core java"+fileSeparator+"Java IO"+fileSeparator+"18 - IOStreams"+fileSeparator+"NIODemo.txt");
		Path directory = Paths.get("D:"+fileSeparator+"Final Interview"+fileSeparator+"Core java"+fileSeparator+"Java IO"+fileSeparator+"18 - IOStreams"+fileSeparator+"NIODemo1");
		Path Trdirectory = Paths.get("D:"+fileSeparator+"Final Interview"+fileSeparator+"Core java"+fileSeparator+"Java IO"+fileSeparator+"18 - IOStreams"+fileSeparator+"NIODemoTR");
		
		Path pathTaget = Paths.get("D:"+fileSeparator+"Final Interview"+fileSeparator+"Core java"+fileSeparator+"Java IO"+fileSeparator+"18 - IOStreams"+fileSeparator+"NIODemoTarget.txt");
		
		if (Files.exists(path)){
			System.out.println(path.toString()+" - Already exists. ");
		}
		else{
			Files.createFile(path);
		}
		
		if (Files.exists(directory)){
			System.out.println(directory.getFileName()+" - Already exists. ");
		}
		else{
			Files.createDirectory(directory);
		}

		System.out.println("Files.isDirectory(directory)  -- " + Files.isDirectory(directory));
		System.out.println("Files.isDirectory(path)  -- " + Files.isDirectory(path));
		
		System.out.println("Files.isRegularFile(directory)  -- " + Files.isRegularFile(directory));
		System.out.println("Files.isRegularFile(path)  -- " + Files.isRegularFile(path));
		
		System.out.println("Files.delete(path)"+path.toString() ); Files.delete(path);
		System.out.println("Creating again - "+path.toString());Files.createFile(path);
		
		System.out.println("copying file Source: [" +path.toString() + "] Destination: ["+  pathTaget.toString()+"]");
		Files.copy(path,pathTaget,StandardCopyOption.REPLACE_EXISTING);
		
		System.out.println("Moving file Source: [" +path.toString() + "] Destination: ["+  pathTaget.toString()+"]");
		Files.move(path,pathTaget,StandardCopyOption.REPLACE_EXISTING);		
		
		System.out.println("Moving directory Source: [" +directory.toString() + "] Destination: ["+  Trdirectory.toString()+"]");
		Files.move(directory,Trdirectory,StandardCopyOption.REPLACE_EXISTING);			
	}
}