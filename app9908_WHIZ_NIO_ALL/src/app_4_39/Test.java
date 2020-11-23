package app_4_39;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Test {

	public static void main(String[] args) {

		
		Path p1 = Paths.get("F:\\Whizlab\\java\\NIO");
		
		Path p2 = Paths.get("C:\\Output");
		
		Path p3 = Paths.get(p2.getRoot().toString(),     p1.subpath(0, 3).toString());
		
		System.out.println(p3.toString());
	}

}
// Note:   we are using toString() method in the p3  = Paths.get()   as .get()  method take String
//        as parameter but if we do not use toString()   then compilation error