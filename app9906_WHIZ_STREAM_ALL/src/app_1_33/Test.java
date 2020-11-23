package app_1_33;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {

		Stream<String> s = Stream.of("1","2","3","4").parallel();
		
		IntStream ins = s.mapToInt(x -> Integer.parseInt(x));
		
		System.out.println(ins.isParallel());
	
	
         System.out.println("----------------------");		
		
         
         
        Stream<String> s2 = Stream.of("1","2","3","4");   // by default Stream is sequential()  
		                                                       // hier the isParallel() method return false 
		IntStream ins2 = s2.mapToInt(x -> Integer.parseInt(x));
		
		System.out.println(ins2.isParallel());
	
	
	
	
	
	
	
	
	
	
	}

}
