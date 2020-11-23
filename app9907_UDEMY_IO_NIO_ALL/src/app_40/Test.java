package app_40;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class Test {

	public static void main(String[] args) throws IOException{

		Path p1 = Paths.get("D:\\Extra_Space_For_FOS\\A\\B\\C\\Book1.txt"); //  Book1.txt exists in this path
		
		Path p2 = Paths.get("D:\\Extra_Space_For_FOS\\A\\B\\C\\bb.txt");  // this bb.txt file does not exists
		
		System.out.println(Files.getAttribute(p1, "creationTime"));
		
	//	System.out.println(Files.getAttribute(p2, "creationTime"));  as  Path p2    this  bb.txt  does not exists, hier
	//	                                                         .getAttributes() check exactelly if the bb.txt exists
	//                                         if bb.txt does not exists, then this method will throw exception
		
		System.out.println("----------------");
		
		
		System.out.println(Files.readAttributes(p1, "*").get("creationTime"));  //in this way it will just return the 
//                                                                            creating time only for the Book1.txt
//                                                                   	not for the other defined  .txt files
		
		System.out.println("---------------------");
		
		System.out.println(Files.readAttributes(p1, BasicFileAttributes.class).creationTime());
		
		System.out.println(Files.readAttributes(p1, BasicFileAttributes.class).size());
		System.out.println(Files.readAttributes(p1, BasicFileAttributes.class).isDirectory());
		System.out.println(Files.readAttributes(p1, BasicFileAttributes.class).isRegularFile());
		System.out.println(Files.readAttributes(p1, BasicFileAttributes.class).isSymbolicLink());
		System.out.println(Files.readAttributes(p1, BasicFileAttributes.class).lastAccessTime());
		System.out.println(Files.readAttributes(p1, BasicFileAttributes.class).lastModifiedTime());
		
		
		
		
		
	
	
	}

}
