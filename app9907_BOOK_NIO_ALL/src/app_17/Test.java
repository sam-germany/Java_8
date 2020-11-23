package app_17;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Test {

	public static boolean m1(Path p) throws Exception{
		
		if(!Files.isDirectory(p) && !Files.isSymbolicLink(p)) {
			return Files.deleteIfExists(p);                    

		}else return true;
		
	}
	
	public static void main(String[] args) throws Exception {
		
		File file1 = new File("D:\\Extra_Space_For_FOS\\Z1");
        file1.createNewFile();             // this method throw  IOException
       
        for(File x : file1.listFiles()) {
        	System.out.println(m1(x.toPath()));   //       .toPath()  method throws Exception
        }
        
		
	}

}
