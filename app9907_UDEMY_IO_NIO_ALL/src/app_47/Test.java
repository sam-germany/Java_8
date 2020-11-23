package app_47;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Test {

	public static void main(String[] args) {

		Path p1  = Paths.get("D:\\A");
		
		System.out.println(p1.getRoot());
		
		System.out.println(p1.getParent());
		
		System.out.println(p1.getRoot().equals(p1.getParent()));
	
		
		System.out.println("----------------");
		
		
        Path p2  = Paths.get("D:\\A\\B");
		
		System.out.println(p2.getRoot());
		
		System.out.println(p2.getParent());
		
		System.out.println(p2.getRoot().equals(p2.getParent()));
		
		
		
		
		
		
		
		
	}

}
