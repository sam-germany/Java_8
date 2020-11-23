package app_36;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Test {

	public static void main(String[] args) {

		Path p = Paths.get("D:\\Extra_Space_For_FOS\\A\\B9\\C9\\D9\\..\\Book1.txt");
		
		System.out.println(p.toAbsolutePath());
		
	}

}


// Note:   this  .toAbsolutePath()  method return directly the absolute path it will not check if this
// path really exists or not. it will not check which folder  or file exists or not it just return answer