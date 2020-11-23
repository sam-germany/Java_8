package app_5_50;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Test {

	public static void main(String[] args) {

		Path p1  = Paths.get("\\photos\\vacation");
		Path p2 = Paths.get("\\yellowstone");
		
		System.out.println(p1.resolve(p2) +"          "+p1.relativize(p2));
		
		Path s1  = Paths.get("c:\\photos\\vacation");
		Path s2 = Paths.get("c:\\yellowstone");
		
		System.out.println(s1.resolve(s2) +"          "+s1.relativize(s2));
		
		Path g1  = Paths.get("c:\\photos\\vacation");
		Path g2 = Paths.get("\\yellowstone");
		
		System.out.println(g1.resolve(g2));
		
	
		
		Path j1  = Paths.get("c:\\photos\\vacation");
		Path j2 = Paths.get("yellowstone");
		
		System.out.println(j1.resolve(j2));
		
		
	//	System.out.println(p7.relativize(p8));   if we do relativize one with root and other not then exception
	}

}
