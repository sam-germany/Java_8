package app_0_38;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) throws IOException {

	  List s = Files.readAllLines(Paths.get("D:\\Extra_Space_For_FOS_2\\rr\\1a.TXT"));
		
		s.forEach(System.out::println);
	}

}
