package app_1_36;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test {

	public static void main(String[] args) throws IOException {

		Path p1 = Paths.get("D:\\Extra_Space_For_FOS_2\\rr\\1a.txt");
		
		Path p2 = Paths.get("..\\1a.txt");
		
		System.out.println(Files.isSameFile(p1, p2));
	}

}
