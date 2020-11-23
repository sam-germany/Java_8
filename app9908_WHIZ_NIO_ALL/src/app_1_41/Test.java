package app_1_41;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) throws IOException {

		List l = Files.readAllLines(Paths.get("D:\\Extra_Space_For_FOS_2\\rr\\1a.TXT"));
		
		l.forEach(System.out::println);
		
		
	}

}
// .readAllLines() throws IOException  and it takes a (Path) and return a List