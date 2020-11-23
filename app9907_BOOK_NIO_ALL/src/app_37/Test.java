package app_37;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test {

	public void m1(Path p) throws IOException {
    	Files.lines(p);                           // .lines(path) method  throws IOException
	}
	
	
	public void m2(Path p) throws IOException {
		Files.readAllLines(p);                    // .readAllLines(path)  method throws IOException
	}
	
	public static void main(String[] args)  throws IOException{

		Path p  = Paths.get("D:\\Extra_Space_For_FOS\\bin\\1.TXT");
		
          final  Test t = new Test();
		         t.m1(p); 
		         t.m2(p);
		
	}

}
