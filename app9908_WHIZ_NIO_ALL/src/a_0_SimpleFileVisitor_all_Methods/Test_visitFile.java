package a_0_SimpleFileVisitor_all_Methods;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

class MyFileVisitor2 extends SimpleFileVisitor<Path>{
	
	private int fileCount = 0;
	private int dirCount = 0;
	
	public int getFileCount() {
		return fileCount;
	}
	public int getDirCount() {
		return dirCount;
	}

	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {

		System.out.println("visitFile----  "+ file +"     --- size--- =  "+ attrs.size()+ " ----bytes ");
		fileCount++;
		return FileVisitResult.CONTINUE;
	}
}
public class Test_visitFile {
	public static void main(String[] args) {
	
	Path path = Paths.get("D:\\Extra_Space_For_FOS_2\\rr");
	
	MyFileVisitor2 fileVisitor = new MyFileVisitor2();
	
            try {
				Files.walkFileTree(path, fileVisitor);
				
				System.out.println(fileVisitor.getFileCount());
				
				System.out.println(fileVisitor.getDirCount());
            	
			} catch (Exception e) {
	           
				 e.printStackTrace();
			}   }}

/*  Their is a predefined class  SimpleFileVisitor  with 4 predefined methods, 
 
 (3)  visitFile(Path file, BasicFileAttributes attrs) throws IOException
 
 we are not alloweed to change the arguments these are predefined so we need to put the same , 
 this method will not read about directory , this method is searching  for the files and check the every file
 and return the values of every file, if their is a file inside 4 different directories then it go one by one
 to the last directory and check that file and return the values of that file as showing hier
 
 
 
 
*/