package app_22;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test {

	public static void main(String[] args) throws IOException {

		Path p = Paths.get("D:/Extra_Space_For_FOS");
		
		System.out.println(p.resolve("/backward/a1/b1/forward/Sort.java").toRealPath());

		
//                                                                     .toRealPath() throws IOException		          
//		System.out.println(p.resolve("../backwards/..forward/Sort.java").toRealPath());
	
	
//		System.out.println(p.resolve("../forward/./Sort.java"));
	
	
	
	
	
	}       

}
