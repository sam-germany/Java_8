package app_2_12;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Test {

	public static void main(String[] args) {

		Path p1  = Paths.get("C\\temp\\test.txt");
		Path p2 = Paths.get("report.pdf");
		
		System.out.println(p1.resolve(p2));
	
	
		Path p3  = Paths.get("C\\temp\\test.txt");
		Path p4  = Paths.get("C:\\report.pdf");
		
		System.out.println(p3.resolve(p4));
		
		Path p5  = Paths.get("C\\temp\\test.txt");
		Path p6  = Paths.get("D:\\report.pdf");
		
		System.out.println(p5.resolve(p6));
	}
	
	}


