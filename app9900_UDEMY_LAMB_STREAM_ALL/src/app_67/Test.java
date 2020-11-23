package app_67;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {

		//  way 1
		Stream<Integer> s =  Arrays.asList(1,2,3,4,5).stream();   // like this way we can create
	                                                           // Generic Stream<Integer>
		                                                   // with .stream(); method
	
		System.out.println(s);  // as it is a Stream so syso() will not print the elements
		
		s.forEach(System.out::print);   /// we need to use forEach() to print the elements
		
		
		
	//  way 2
		Stream<Integer> s2 = Arrays.stream(new Integer [] {1,2,3,4,5}); // like this also we can 
		                                                            // create a new Stream
		s2.forEach(System.out::println);
	
	//  way 3
		Stream<Integer> s3 = Stream.of(8,9,8,75,6,6);
		s3.forEach(System.out::print);
		
		
		
	}

}
