package app_3_31;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test {

	public static void main(String[] args) throws URISyntaxException {

		Path p1 = Paths.get(new URI("file://e:/temp/records"));
		
		System.out.println(p1);
		
	}

}
