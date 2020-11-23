package app_63;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Test {

	public static void main(String[] args) throws IOException {

		// .lines()  method throws IOException
		
		Files.lines(Paths.get("D:\\Extra_Space_For_FOS\\A\\B\\C\\Book1.TXT"))
             .forEach(System.out::println);
		
		
		Files.readAllLines(Paths.get("D:\\Extra_Space_For_FOS\\A\\B\\C\\Book1.TXT"))
		     .forEach(System.out::println);
		
		
	}

}
