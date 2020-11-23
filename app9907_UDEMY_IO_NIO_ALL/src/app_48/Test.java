package app_48;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test {

	public static void main(String[] args) throws IOException {

		Path p1 = Paths.get("D:\\Extra_Space_For_FOS\\A\\B\\C\\Book1.txt");
		
		long size1  = Files.size(p1);   // .size() throws IOException
		
		
		
		File f1 = new File("D:\\Extra_Space_For_FOS\\A\\B\\C\\Book1.txt");
        
		long size2  = f1.length();
		
		
		System.out.println(size1 == size2);
	
	}

}
