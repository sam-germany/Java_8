package app_69;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) throws IOException {

		
		Stream<Path> p1 = Files.walk(Paths.get("D:\\Extra_Space_For_FOS"));
		
		     p1.filter(x ->!Files.isDirectory(x))
               .forEach( x ->{
            	                 try {
            	                	 Files.readAllLines(x)
            	                	      .stream() 
                                          .forEach(System.out::println);
            	                 }catch(IOException e) {
            	                	 System.out.println("Failed");
            	                                     }
                              });		
		
		     
		
	}

}
// Note   .isDirectory()  and   .readAllLines()  both throws  IOException