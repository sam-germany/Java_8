package app_2_38;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Test {

	public static void main(String[] args) {



        Path p1 = Paths.get("\\personal\\readme.txt");
        Path p2 = Paths.get("\\index.html");
        Path p3 = p1.relativize(p2);
        System.out.println(p3);

        
        Path z1 = Paths.get("\\personal\\readme.txt");
        Path z2 = Paths.get("\\personal\\readme.txt\\index.html");
        Path z3 = z1.relativize(z2);
        System.out.println(z3);
        
      
        Path k1 = Paths.get("\\personal\\readme.txt");
        Path k2 = Paths.get("\\personal\\readme.txt\\personal\\index.html");
        Path k3 = k1.relativize(k2);
        System.out.println(k3);
		
	}

}
