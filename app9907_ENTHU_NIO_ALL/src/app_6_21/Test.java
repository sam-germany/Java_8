package app_6_21;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Test {

	public static void main(String[] args) {

		
		Path p1 = Paths.get("\\temp\\records");
		
		Path p2 = p1.resolve("clients.dat");
		
		System.out.println(p2);

		
		System.out.println("------------------------");
		
		
        Path s1 = Paths.get("\\temp\\records");
		
		Path s2 = s1.resolve("\\clients.dat");
		
		System.out.println(s2);

		
		
		
	}

}
