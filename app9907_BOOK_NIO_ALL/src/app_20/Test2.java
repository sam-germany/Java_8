package app_20;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test2 {

	public static void main(String[] args) throws IOException {

		
		
		
		Path p = Paths.get("/", "onjC", "bin");
	   System.out.println(p.resolve("../backwards/../forward/Sort.java"));
	   
	   
	   Path p2 = Paths.get("/", "onjC", "bin");
	   Path p3  = Paths.get("../backwards/../forward/Sort.java");
	   
	  System.out.println(p2.resolve(p3));
	  
	  System.out.println(p3.resolve(p2));
	   
	
	
	}

}
