package app_1_38;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Test {

	public static void main(String[] args) {

		Path p1 = Paths.get("F:\\Whizlabs\\java\\Nio\\myfiles");
		
		Path p2 = Paths.get("F:\\Whizlabs\\java\\Nio\\myfiles\\data");
		
		Path p3 = p1.relativize(p2);
		System.out.println(p3);

		Path p4 = p2.relativize(p1);
		System.out.println(p4);
		
		
	}

}


// Note:  if both the Path do nothave same root  suppose we have F: and D: then
// we will get exception


//just draw in mind how we will come from p1 to p2   and from p2 to p1
