package app_34;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test {

	public static void main(String[] args) throws IOException {

		Path p = Paths.get("D:\\Extra_Space_For_FOS\\A\\B\\C\\D1\\..\\Book1.txt");
		
		System.out.println(p);

	
		System.out.println(p.toRealPath());  // .toRealPath() throws IOException
	}

}

// as  Book1.txt is avilable under  C folder so the  .toRealPath()  give us this output
// but if the book1.txt  does not exist under C folder then we will get exception