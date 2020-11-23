package app_36;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) throws Exception{

		Path p = Paths.get("D:\\Extra_Space_For_FOS\\bin");  //   bin  is a folder and with  Files.walk() method
		                                                      // we go inside this folder and take the needed
		                                                    // file which we want 
		
		
		 // NOTE: in Files.walk() method we do not need to defiene depth
		
		Files.walk(p)                                 
		            .map(z -> z.toAbsolutePath().toString()) // we must use .toString() method to convert the 
		            .peek(System.out::println)              // path into String. after that we can call
		            .filter(s ->s.endsWith(".TXT"))         //   .endsWith() method on it.
		           
		            .collect(Collectors.toList())  // hier .toList() method take all the result and
		            .forEach(System.out::println);       // after that at one time it will print from hier 
                                                         //  all the result which comes hier
		
		System.out.println("-----------");
		
	Files.find(p, Integer.MAX_VALUE, (w,y) -> w.toAbsolutePath().toString().endsWith(".TXT"))
	     .collect(Collectors.toList())
		 .forEach(System.out::println);
		
		
	}

}
