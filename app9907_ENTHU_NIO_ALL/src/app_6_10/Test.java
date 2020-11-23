package app_6_10;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Test {

	public static void main(String[] args) {

		Path d1 = Paths.get("/works");
		Path d2 = d1.resolve("ocpjp/code");
		
		System.out.println(d2);
		
		
		d1.resolve("ocpjp/code/sample");
	
		System.out.println(d2);   // we are not printing hier the modified part, we are still
		                          //printing the d2 this is the reason we are getting this output
		d1.toAbsolutePath();        // read the point 2 of the explanation the i will understand
		
		System.out.println(d1);
		System.out.println(d2);
		
	}

}
