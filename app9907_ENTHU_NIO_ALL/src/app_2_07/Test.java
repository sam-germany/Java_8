package app_2_07;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Test {

	public static void main(String[] args) {

		Path p1 = Paths.get("c:/photos/goa/ds");
		Path p2 = Paths.get("c:/indes");
		
		Path p3 = p1.relativize(p2);
		System.out.println(p3);
		
		
		Path p4 = p2.relativize(p1);
		System.out.println(p4);
		
		
	}

}
