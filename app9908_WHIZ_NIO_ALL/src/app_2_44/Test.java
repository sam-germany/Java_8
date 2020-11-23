package app_2_44;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class Test {

	
	private static final class Search1 extends SimpleFileVisitor<Path>{
	
		public FileVisitResult visitFile(Path file, BasicFileAttributes bfa) throws IOException{
			
			
			PathMatcher pm = FileSystems.getDefault().getPathMatcher("glob:*.txt"); 
//                                                                  ("glob:*.txt"); it prints the files with .txt extension			
//			                                                        ("glob:*.*");  it print all the privided lies
			
			if(pm.matches(file.getFileName())) {
				System.out.println(file);
			}
			
		
			return FileVisitResult.CONTINUE;
		}
	}
	public static void main(String[] args) throws IOException {

		Path path = Paths.get("D:\\Extra_Space_For_FOS_2\\rr");
		
		FileVisitor<Path> searcher = new Search1();
		
		Files.walkFileTree(path, searcher);
	}

}
