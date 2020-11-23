package app_2_42;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.util.regex.Pattern;

public class Test {

	static boolean f;
	
	 private static final class Search1 extends SimpleFileVisitor<Path>{
		 
		 public FileVisitResult postVisitDirectory(Path dir, IOException e)  throws IOException{
			 System.out.println("-------------");
			 
			 
			 PathMatcher pm = FileSystems.getDefault().getPathMatcher("glob:*");
			 
			 if(pm.matches(dir.getFileName())) {
				 System.out.println(dir);
				 
				 f = true;
			 }
			 return FileVisitResult.CONTINUE;
		 }
	 }
	public static void main(String[] args)  throws IOException{
		
		Path path = Paths.get("D:\\Extra_Space_For_FOS_2\\rr");
		
		FileVisitor<Path> se1 = new Search1();
		
		Files.walkFileTree(path, se1);
		
		System.out.println(f);
		
		if(!f)
			System.out.println("No matcher");
	}
}
// Note: in the begining of  WHIZLAN NIO  i create a folder and their i put the examples
// of the all the 4 methods defined in the SimpleFileVisitor class