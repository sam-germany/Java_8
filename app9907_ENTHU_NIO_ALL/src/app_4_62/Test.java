package app_4_62;

import java.awt.BufferCapabilities;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test {


	public static void main(String[] args) {
		
	
		Path p1 = Paths.get("D:\\Extra_Space_For_FOS_2\\dd\\aa\\test.txt.TXT");
		
		Path p2 = Paths.get("test2.txt");

		Path p3 = p1.resolveSibling(p2);
		System.out.println(p3);
		
		
		Path p4 = Paths.get("D:\\Extra_Space_For_FOS_2\\dd\\aa\\test.txt.TXT");
		
		Path p5 = Paths.get("D:", p4.subpath(0, 3).toString() , "test2.txt");
	
		 System.out.println(p5);
		
		
		 System.out.println("-----------------");
		 
		 
		    Path s1 = Paths.get("D:\\Extra_Space_For_FOS_2\\dd\\aa\\test.txt.TXT");
			
			Path s2 = Paths.get("\\test2.txt");  //  if we put  "\\test2.txt"   \\ these 2 backslash
                                                //  then see the output it is totally different.
			Path s3 = s1.resolveSibling(s2);
			System.out.println(s3);
		 
		 
		
		
		     }
				

}
