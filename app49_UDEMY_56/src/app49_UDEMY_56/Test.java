package app49_UDEMY_56;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) throws IOException {
		
		Path  root = Paths.get("D:\\Extra_Space_For_FOS\\f");
		
		BiPredicate<Path, BasicFileAttributes> predicate = (p,d) -> p.toString().endsWith("pdf");
		
		try(Stream<Path> paths = Files.find(root, 1, predicate)){
			
			paths.forEach(System.out::println);
		}
		
	}

}
