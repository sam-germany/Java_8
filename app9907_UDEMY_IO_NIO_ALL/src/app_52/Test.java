package app_52;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Test {

	public static void main(String[] args) {

		Path p1 = Paths.get("D:\\A\\B\\C");
		Path p2  = Paths.get("D:\\A");
		
		System.out.println(p1.relativize(p2));
		
		System.out.println(p2.relativize(p1));
		
		
		System.out.println("-------------------------");
		
		
		
       
		Path p3 = Paths.get("A\\B\\C");
		Path p4  = Paths.get("A");
		
		System.out.println(p3.relativize(p4));
		
		System.out.println(p4.relativize(p3));
		
		
	}

}
