package app_56;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args)  throws IOException{

		Path p1 = Paths.get("D:\\Extra_Space_For_FOS");
	
		BiPredicate<Path, BasicFileAttributes> pri = (p,a) -> p.toString().endsWith("txt");
		
		try(Stream<Path> p2 = Files.find(p1, 2, pri))
		{
			p2.forEach(System.out::println);
			
		}
		
	}

}
// Note:  Files.find(Path, Maxdepth, BiPredicate);      as this Files.find()  method takes BiPredicate
//         so we must use BiPredicate otherwise compilation error we will get.

