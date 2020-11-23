package a_0_SimpleFileVisitor_all_Methods;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

class MyFileVisitor extends SimpleFileVisitor<Path>{
	
	private int fileCount = 0;
	private int dirCount = 0;
	
	public int getFileCount() {
		return fileCount;
	}
	public int getDirCount() {
		return dirCount;
	}

	@Override
	public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {

		System.out.println("preVisit ----"+ dir +" size = "+ attrs.size() +" bytes");
		dirCount++;
		return FileVisitResult.CONTINUE;
	}
}
public class Test_preVisitDirectory {
	public static void main(String[] args) {
		
	Path path = Paths.get("D:\\Extra_Space_For_FOS_2\\rr");
	
	MyFileVisitor fileVisitor = new MyFileVisitor();
	
            try {
				Files.walkFileTree(path, fileVisitor);
				
				System.out.println(fileVisitor.getFileCount());
				System.out.println(fileVisitor.getDirCount());
            	
			} catch (Exception e) {
				 e.printStackTrace();
			}  }}

/*   Their is a predefined class  SimpleFileVisitor  with 4 predefined methods,       
  
        @Override 
(2)    preVisitDirectory(Path dir, BasicFileAttributes attrs);   

this is the predefined type with arguments,if we try to change the argument with any other 
type then we will get error,

as per the name  preVisit...   this method goes to the each directory and check the values inside the directory
But it will not go inside every directory , and if their is a another directory inside a directory then
it will go and search for it also,
Note:  this method only check the directories and return the size of that directory, it will not check the files 
       inside the directory, if their is a directory inside a directory it will go and check it as we have hier
       under   rr -> bb  and under bb -> b1  these are directories are their and it search for every directory
       and return a .size() value for us
 
 
 
*/



