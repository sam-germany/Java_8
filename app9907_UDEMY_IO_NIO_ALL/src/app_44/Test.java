package app_44;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Test {

	public static void main(String[] args) {
   
//                               0                \\ 1\\2\\3\\4           		
		Path p = Paths.get("D:\\Extra_Space_For_FOS\\A\\B\\C\\Book1.txt");
		
		System.out.println(p.subpath(0, 4));

		System.out.println(p.subpath(1,5));  //  as  (1, (5-1))   so this compile  
		

	//	System.out.println(p.subpath(0, 6));  // but if we put 6 hier then it will throw exception
	
	}

}
