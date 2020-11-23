package app_1_39;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Test {

	public static void main(String[] args) {

		Path p = Paths.get("users1\\whizlabs1\\output1");
		
		System.out.println(p.toAbsolutePath().toString());
		
		System.out.println(p.getNameCount());
		
		System.out.println(p.getName(2));
		
		System.out.println(p.getFileName());
		
		System.out.println(p.getRoot());
		
	}

}
