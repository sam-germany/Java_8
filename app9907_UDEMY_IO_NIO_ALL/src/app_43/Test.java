package app_43;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test {

	public static void main(String[] args) throws IOException {

		Path src  = Paths.get("D:\\Extra_Space_For_FOS\\A\\B\\C\\Book1.txt");
		System.out.println(src);
		
		Path tgt  = Paths.get("D:\\Extra_Space_For_FOS\\A\\B\\Book1.txt");
	    System.out.println(tgt);
		
		
		Path copy = Files.copy(src, tgt);  // .copy() throws IOException,  this method take the content 
		System.out.println(copy);          // of source file and copy the conten into target file
		                                 //  src--source file must exists  but the tgt-- target file 
		                                 // must not be their, if target file is their then we will get a  
		                                 // FileAlreadyExist exception 
		
		 
		   System.out.println(Files.isSameFile(src, tgt));     //  false
		  
		    System.out.println(Files.isSameFile(src, copy));  //  false
	        
		    System.out.println(Files.isSameFile(tgt, copy));     //  true
	
	}

}
