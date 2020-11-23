package app_20;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Test {

	public static void main(String[] args) {

		Path p1 = Paths.get("./found/.args./keys.txt");
		Path p2 = Paths.get("/lost/blue.txt");
		
		System.out.println(p1.resolve(p2));
		System.out.println(p2.resolve(p1));
		
		System.out.println("----------------------");
		
		Path p3 = Paths.get("/found/.args./keys.txt");
		Path p4 = Paths.get("/lost/blue.txt");
		
		System.out.println(p3.resolve(p4));
		System.out.println(p4.resolve(p3));
	}
	}


