package app_1_35;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Test {

	public static void main(String[] args) {

        Path  p1 = Paths.get("x\\y");
      
        Path p2 = Paths.get("z");
        
        Path p3 = p1.relativize(p2);
        System.out.println(p3);

        
        Path p4  = p2.relativize(p1);
        System.out.println(p4);
        
        
        
        
        Path  p5 = Paths.get("x\\y");
        
        Path p6 = Paths.get("x\\y");
        
        
        Path p7 = p5.relativize(p6);
		System.out.println(p7);   // as both paths are same so nothing will be printed
        
		
	}

}
