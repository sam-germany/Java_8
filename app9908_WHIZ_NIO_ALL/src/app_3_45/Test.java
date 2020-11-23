package app_3_45;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test {

	public static void main(String[] args) throws IOException {

		Path p = Paths.get("D:\\Extra_Space_For_FOS_2\\rr\\1a.TXT");
		
		System.out.println(Files.getOwner(p));
	}

}
