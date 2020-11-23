package app_59;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test {

	public static void main(String[] args) throws IOException {

		Path p1 = Paths.get("D:\\Extra_Space_For_FOS_2","A2","B2","File.txt");
		
		Files.createDirectories(p1.getParent());
		
		Files.createFile(p1);
		
	}

}
