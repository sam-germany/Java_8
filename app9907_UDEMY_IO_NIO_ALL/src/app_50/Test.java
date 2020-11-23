package app_50;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test {

	public static void main(String[] args) throws IOException {
 
		//            if Path is not correct and not Book1.txt is found then this code throws exception
		
		Path p1 = Paths.get("D:\\Extra_Space_For_FOS\\A\\B\\C\\Book1.txt");  
		
		try(BufferedReader reader = Files.newBufferedReader(p1))
		{
			String str = null;
			
			while( (str = reader.readLine())!= null ) {
				System.out.println(str);
			}
			
			
		}
	
	
	
	}

}//   newBufferedReader amd .readLine() both throws IOException
