import java.nio.file.*;

class NIODemo{
	public static void main(String [] args){
		String fileSeparator = FileSystems.getDefault().getSeparator();
		Path path = Paths.get("D:"+fileSeparator+"Final Interview"+fileSeparator+"Core java"+fileSeparator+"Java IO"+fileSeparator+"18 - IOStreams"+fileSeparator+"NIODemo.txt");
		System.out.println("path.toString() - "+path.toString());
		System.out.println("path.getFileName() - "+path.getFileName());
		System.out.println("path.getParent() - "+path.getParent());
		System.out.println("path.getRoot() - "+path.getRoot());
		
		Path path1 = Paths.get("NIODemo1.txt");
		Path absolutePath = path1.toAbsolutePath(); 
		System.out.println("path1.getFileName() - "+path1.getFileName());
		System.out.println("path1.toString() - "+path1.toString());
		System.out.println("path1.getParent() - "+path1.getParent());
		System.out.println("path1.getRoot() - "+path1.getRoot());
		
		System.out.println("Comparing paths - ");
		System.out.println("path.equals(path1) - " + path.equals(path1));
		//System.out.println("path.startWith(C) - " + path.startsWith(Paths.get("D:")));
		//System.out.println("path.endsWith(txt) - " + path.endsWith(Paths.get("txt")));
		
		//Path subPath = path.subpath(0,16);
		//System.out.println("subPath.getFileName() - "+subPath.getFileName());
	}
}