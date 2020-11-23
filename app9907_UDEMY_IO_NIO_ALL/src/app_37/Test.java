package app_37;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Test {

	public static void main(String[] args) {

		Path p1 = Paths.get("D:\\Extra_Space_For_FOS\\A\\B\\C");  // absolute path
		
		Path p2  = Paths.get("Book1.txt");    // relative path
		
		
		System.out.println(p1.resolve(p2));
		
		System.out.println(p1.resolveSibling(p2));
		
	}

}
// hier as their is a Book1.txt file is in the C folder  then also .resolveSibling()
//   give this output, it shows  this method do not check exactly where the file 
// exactelly exits