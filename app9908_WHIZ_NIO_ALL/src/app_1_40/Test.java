package app_1_40;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) throws IOException {

		Stream<Path>  l = Files.list(Paths.get("D:\\Extra_Space_For_FOS_2\\rr"));
		
		l.forEach(x -> System.out.println(x.getFileName()));
	}

}
// Note:    .getFileName();      will return the  name for both   files and folders