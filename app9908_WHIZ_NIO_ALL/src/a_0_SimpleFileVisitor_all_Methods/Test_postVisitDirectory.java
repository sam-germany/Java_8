package a_0_SimpleFileVisitor_all_Methods;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

class MyFileVisitor4 extends SimpleFileVisitor<Path>{
	
	private int fileCount = 0;
	private int dirCount = 0;
	
	public int getFileCount() {
		return fileCount;
	}
	public int getDirCount() {
		return dirCount;
	}

	@Override
	public FileVisitResult postVisitDirectory(Path dir, IOException ex) throws IOException {
        
		System.out.println("postVisitDirecotry---   "+ dir + "  --- Exception --  "+ ex);
		dirCount++;
		return FileVisitResult.CONTINUE;
	}
}
public class Test_postVisitDirectory {
	public static void main(String[] args) {
		
	
	Path path = Paths.get("D:\\Extra_Space_For_FOS_2\\rr");
	
	MyFileVisitor4 fileVisitor = new MyFileVisitor4();
	
            try {
				Files.walkFileTree(path, fileVisitor);
				
				System.out.println(fileVisitor.getFileCount());
				
				System.out.println(fileVisitor.getDirCount());
            	
			} catch (Exception e) {
	           
				 e.printStackTrace();
			} }}
/*
 Their is a predefined class  SimpleFileVisitor  with 4 predefined methods, these all 4 methods will
 execute automatically when we call the class in our case class MyFileVisitor4 extends SimpleFileVisitor<Path>

 as  we are implementing SimpleFileVisitor class now we can also use  Files.walkFileTree() method
   
 
      @Override
 (1)  postVisitDirectory(Path dir, IOException ex);   so is the predefined  method 
 
 return type of this method is FileVisitResult  as the name shows of this method that it takes a path with directory 
 and go inside the directory  and give us the count back that how many directories are avilable,
 the method name start with postVisit....   means that after executing compiler goes inside the given directory
 and search for the directories defined inside the given directory.  

 Note:(a)            postVisitDirectory(Path dir,BasicFileAttributes attrs);

if we try to put arguments like this then code will not compile so we can use only predefined

Note: (b)   return FileVisitResult.CONTINUE;  their are 4 constent values 
                   FileVisitResult.SKIP_SIBLING
                   FileVisitResult.SKIP_SUBTREE
                   FileVisitResult.TERMINATE
             
 like this it will return the defined method fields and also as per these  CONSTANTS it will react                  

*/


