package app_39;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test {

	public static void main(String[] args) throws IOException {

		Path p1 = Paths.get("D:\\Extra_Space_For_FOS\\A\\B\\C");
		
		Path p2 = Paths.get("D:\\Extra_Space_For_FOS\\A\\B\\C\\Book1.txt");
		
		
		System.out.println(Files.isDirectory(p1));  // .isDirectory() method check the last defined is a folder and
	                                                // really exists and if exists then return true, if the last
	   System.out.println(Files.isDirectory(p2));  // defined does not exists or it is  file not a folder then it return
	                                               //  false


	   
	   System.out.println(p1.toFile().isDirectory()); // these both method excatelly checks if it is folder
	   System.out.println(p2.toFile().isDirectory()); // then return true otherwise return false
	   
	   
	   System.out.println(Files.getAttribute(p1, "isDirectory"));  // Files.getAttribute() throws IOException
	   System.out.println(Files.getAttribute(p2, "isDirectory")); //  these methods exactelly checks if this
	                                                          // path  exists and is a folders then return
	                                                         // true otherwise it return false
	   
	   
	   
	}                                              
	
	

}
