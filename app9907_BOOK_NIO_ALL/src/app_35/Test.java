package app_35;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Test {

	public void m1() {
		
		Path p1 = Paths.get("stars/./rocks/../m1.meteor").normalize();
		System.out.println(p1);
		
//		                     0 / 1   /2 /  3 /              index nr
		Path p2 = Paths.get("./stars/../solar/");
		System.out.println(p2);
		
		p2  = p2.subpath(0, 3).resolve("m1.reteor");
		System.out.println(p2);
		
		p2 = p2.subpath(0, 3).resolve("m1.reteor").normalize();
		System.out.println(p2);
		
		
		System.out.println(p1.equals(p2) ? "both are same" : "Different");
	}
	
	
	public static void main(String[] args) {
      Test s = new Test();
		s.m1();
      
		
		
	}

}
