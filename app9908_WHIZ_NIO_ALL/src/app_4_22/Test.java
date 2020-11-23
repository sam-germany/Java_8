package app_4_22;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) throws IOException {

		List<String> l = Files.readAllLines(Paths.get("D:\\Extra_Space_For_FOS_2\\rr\\1a.TXT"));
	
		          l.stream()
		           .skip(1)
		           .forEach(System.out::println);
	
		          
	}

}
// note:   Files.readAllLines ()   throws IOException   and it return   List<String>