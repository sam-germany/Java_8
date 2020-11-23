package app_51;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Test {

	public static void main(String[] args) {

		Path p1  = Paths.get("F:\\A\\.\\B\\C\\D\\..\\Book.java");
		
		System.out.println(p1);
	
		p1.normalize();
	
		System.out.println(p1);
	
		System.out.println(p1.normalize());
	}

}


// hier .normalize()  method do not check if  PATH really exists or not