package app_19;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test {

	public static void main(String[] args) {

		
		Path p1 = Paths.get("/locks/found");
		Path p2 = Paths.get("/found/red.txt");
		
		System.out.println(p1.relativize(p2));  //    ..\..\found\red.txt
		
		System.out.println(p2.relativize(p1));  //    ..\..\locks\found
		
		
//		Path p3 = Paths.get("./found");               // relative path
//		Path p4 = Paths.get("/found/red.txt");        // absolute Path
		
//   if we try to put like this then we will get error.		
	
		
		
	}

}
