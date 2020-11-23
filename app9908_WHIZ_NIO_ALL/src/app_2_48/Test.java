package app_2_48;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) throws IOException {

		Path p = Paths.get("D:\\Extra_Space_For_FOS_2\\rr");
		
		Stream<Path> f1  =  Files.list(p); 
		
	 
		f1.forEach(s -> System.out.println(s +" | "));
	
		     
//		f1.forEach(s -> System.out.println(s.getFileName() +" | "));

		
// Note:  both forEach() method will work with  .getFileName() and without it works
//                                                                both wil work
		
		
	}

}
