package app_3_46;

import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.regex.Pattern;

public class Test {

	static boolean f;
	
	
	  public static final class Search1 extends SimpleFileVisitor<Path>{
			
			public FileVisitResult visitFile(Path file, BasicFileAttributes bfa) throws IOException{
				
			Pattern p = Pattern.compile("....\\.....");
			
				PathMatcher pm = FileSystems.getDefault().getPathMatcher("regex:"+ p );
				
				if(pm.matches(file.getFileName())) {
					
					System.out.println(file);
					
					f = true;
				}
			
				return FileVisitResult.CONTINUE;
			}
	
	public static void main(String[] args) throws IOException {
	
		Path path  = Paths.get("D:\\Extra_Space_For_FOS_2\\rr"); 
		
		FileVisitor<Path> searcher = new Search1();
		
		Files.walkFileTree(path , searcher);
		
		if(!f) System.out.println("No matcher");
		
}


	}
}
