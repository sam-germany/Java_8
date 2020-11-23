package app_1_73;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Test {

	public static void main(String[] args) {



        Path p1 = Paths.get("c:\\code\\java\\PathTest.java");
      
        System.out.println(p1.getName(2));
        
        System.out.println(p1.getName(2).toString());

		
	}

}
