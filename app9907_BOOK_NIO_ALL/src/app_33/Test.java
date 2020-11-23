package app_33;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test {

	public static void main(String[] args) throws IOException {

		Path p1 = Paths.get("/./desert/./").resolve(Paths.get("sand.doc"));
		System.out.println(p1);
		System.out.println(p1.normalize());
		
		System.out.println("----------------");
		
		Path p2 = Paths.get("/desert/./cactus/../sand.doc");
		System.out.println(p2);
		System.out.println(p2.normalize());
		
        
		System.out.println(" "+ p1.equals(p2));
		
		System.out.println(" "+ p1.normalize().equals(p2.normalize()) );
		
		
		System.out.println(Files.isSameFile(p1, p2));  // this method throws  IOException

// Note:   .isSameFile(p1,p2);    if the both files are not same then this method throws exception 		
		
		
		
		
	}

}
