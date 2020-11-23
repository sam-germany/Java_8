package app_5_42;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) throws IOException {

	Stream<Path> out = Files.find(Paths.get("D:\\Extra_Space_For_FOS_2\\rr"), 0, (x,y) -> x.getFileName()
				                                                                           .toString()
				                                                                           .startsWith("d"));
		System.out.println(out.count());
		
	}

}
