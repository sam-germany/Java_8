package app_40;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Test {

	public static Stream<Path> m12(Path p){
		
		try {
			//	return Files.lines(p); // this method return Stream<String> so the data written will be
			                      //    return as a String                
			
			
			 return Files.walk(p);   // it return  Strea<Path> so absolute path return
			
		}catch(Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	public static long count1(Path p) throws Exception{
		return Files.list(p)
				            .filter(w -> Files.isRegularFile(w))
				            .flatMap(s -> m12(s))  //as .flatMap() we know must return new Stream for every
				            .peek(System.out::println) // element, same is doing m12() method
				            .count();  
		                                 // hier the count method return the nr of lines 
	                                     //  which are avilable  in all the files
	                                   // as we have in book1  folder   4 files but we have
	}                                 //  2 lines of data in 1.txt and also 2 line in 2.txt
	                                   // so total 4 lines this will be returned by .count()
	
	public static void main(String[] args) throws Exception {
		
		System.out.println(count1(Paths.get("D:\\Extra_Space_For_FOS\\book1")));

		
	}

}
