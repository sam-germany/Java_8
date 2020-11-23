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

public class Test2 {

	public static void main(String[] args) throws IOException {

		Path startDir1 = Paths.get("D:\\Extra_Space_For_FOS_2\\rr");
		
		String pattern = "*.{txt,pdf}";

		FileSystem fs = FileSystems.getDefault();
		final PathMatcher matcher1 = fs.getPathMatcher("glob:" + pattern);

		FileVisitor<Path> matcherVisitor1 = new SimpleFileVisitor<Path>() {
		   
			@Override
		    public FileVisitResult visitFile(Path p, BasicFileAttributes attribs) {
		       
				Path name = p.getFileName();
				
		        if (matcher1.matches(name)) {
		            System.out.print( p + "\n");
		        }

		        return FileVisitResult.CONTINUE;
		    }
		};
		Files.walkFileTree(startDir1, matcherVisitor1);
	}

}
