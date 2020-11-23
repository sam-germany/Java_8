package app_4_73;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

// Must read all the points

public class Test {

	public static void main(String[] args) {

		try {
			
			Stream<Path> s = null;
			
			 s = Files.find(Paths.get("D:\\Extra_Space_For_FOS_2"), Integer.MAX_VALUE, (p,a )-> p.endsWith("test.txt")&& a.isRegularFile());
			
			s.forEach(System.out::println);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
/*Note:
 *   public static Stream<Path>  find(Path, int maxDepth, BiPredicate<Path, BasicFileAttributes>) throws IOException
 *   
 *                              find(path,Integer.MAX_VALUE,    (path p, a  attributes)
 *                              
 * int maxDepth  ---- Integer.MAX_VALUE
 * BiPredicate<Path,BasicFileAttributes>    (p.endsWith("test.txt")     as we have hier (p) as Path so we can put this test on it                             
 *                                          (a.isRegularFile()      as (a) we have hier as BasicFileAttributes so we can use this method 
 * 
 */



