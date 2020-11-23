package app_88;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {

		Stream<String> s = Stream.of("123");
	
		s.flatMapToInt(x -> x.chars())
		                          .forEach(System.out::println);
	
	
	
	  	List<String> l = Arrays.asList("3", "6", "8", "14", "15"); 

               l.stream().mapToInt(num -> Integer.parseInt(num)) 
                         .filter(num -> num % 3 == 0) 
                         .forEach(System.out::println); 
		
		
	
	}

}
