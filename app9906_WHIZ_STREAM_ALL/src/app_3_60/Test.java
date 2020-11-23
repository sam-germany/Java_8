package app_3_60;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {

		
		
		Stream<String> l1 = Stream.of("A","BB","CCC","AB","CCC");
	    
		Optional<String> x1 = l1.collect(Collectors.minBy(Comparator.comparing( s -> s.length())));
        System.out.println(x1);
		
        
        Stream<String> l2 = Stream.of("A","BB","CCC","AB","CCC");
		
		Optional<String> x2 = l2.collect(Collectors.maxBy(Comparator.comparing(String::length)));
		System.out.println(x2);
		
	 	
     
		
		
	//  Note:    Collectors.minBy(comparator);  and .maxBy(comparator);  method both return  Optional 
		
		
	}

}
