package app_6_18;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Test {

	public static void main(String[] args) {

		Path p1 = Paths.get("photos\\..\\beaches\\.\\calangute\\a.txt");
		System.out.println(p1);
		
		Path p2 = p1.normalize();
		System.out.println(p2);
		
		Path p3 = p1.relativize(p2);
		System.out.println(p3);
		
		Path p4 = p2.relativize(p1);
		System.out.println(p4);
		
		
		System.out.println(p1.getNameCount()+" "+p2.getNameCount()+" "+p3.getNameCount()+" "+p4.getNameCount());
		
	}

}
