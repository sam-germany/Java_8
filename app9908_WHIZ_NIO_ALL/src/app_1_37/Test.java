package app_1_37;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Test {

	public static void main(String[] args) {

		Path p1 = Paths.get("F:\\Whizlabs\\java\\Nio\\myfiles");
		
		Path p2  = Paths.get("myfiles\\myfile.txt");
	
	    Path p3   = p1.resolve(p2);
	    System.out.println(p3);

	    Path p4  = p2.resolve(p1);
	    System.out.println(p4);
	    
	    
        Path p5 = Paths.get("F:\\Whizlabs\\java\\Nio\\myfiles");
		
		Path p6  = Paths.get("D:\\myfiles\\myfile.txt");
	
	    Path p7   = p5.resolve(p6);
	    System.out.println(p7.toString());

	    Path p8  = p6.resolve(p5);
	    System.out.println(p8);
	    
	    
// Note:  Path p6  if we use D: or F:  we do not get any exception	    
	    
	    
	    
	    
	    
	    
	}

}
