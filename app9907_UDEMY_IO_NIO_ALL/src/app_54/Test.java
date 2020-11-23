package app_54;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Test {

	public static void main(String[] args) {

		Path p1 = Paths.get("F:", "Other", "Logs");
		
		Path p2 = Paths.get("..", "..", "Shortcut", "Child.link", "Message.txt");
		
		
		Path p3 = p1.resolve(p2);
		System.out.println(p3);
		
		Path p4  = p1.resolve(p2).normalize();
		System.out.println(p4);
		
		Path p5 = p1.resolveSibling(p2);
		System.out.println(p5);
		
		Path p6 = p1.resolveSibling(p2).normalize();
		System.out.println(p6);
		
		
		System.out.println(p3.equals(p5));
		
		System.out.println(p4.equals(p6));
		
	}

}
