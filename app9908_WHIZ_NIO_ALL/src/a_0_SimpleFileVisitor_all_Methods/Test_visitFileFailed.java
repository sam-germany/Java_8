package a_0_SimpleFileVisitor_all_Methods;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

class MyFileVisitor3 extends SimpleFileVisitor<Path>{
	
	private int fileCount = 0;
	private int dirCount = 0;
	
	public int getFileCount() {
		return fileCount;
	}
	public int getDirCount() {
		return dirCount;
	}
	@Override
	public FileVisitResult visitFileFailed(Path file, IOException ex) throws IOException {

		System.out.println("visitFileFailed ---"+ file + "IOException "+ ex);
		return FileVisitResult.CONTINUE;
	}
}
public class Test_visitFileFailed {
	public static void main(String[] args) {
	
	Path path = Paths.get("D:\\Extra_Space_For_FOS_2\\rr");
	
	MyFileVisitor3 fileVisitor = new MyFileVisitor3();
	
            try {
				Files.walkFileTree(path, fileVisitor);
				
				System.out.println(fileVisitor.getFileCount());
				
				System.out.println(fileVisitor.getDirCount());
            	
			} catch (Exception e) {
	           
				 e.printStackTrace();
			}   }}
/*  Their is a predefined class  SimpleFileVisitor  with 4 predefined methods,
 
 (4) isitFileFailed(Path file, IOException ex) throws IOException
 
 this method() return all the files that the compiler failed to check , this will check those files and display
 in the output, but in our case all the files are accessable so we do not get any output
 
 
 */

