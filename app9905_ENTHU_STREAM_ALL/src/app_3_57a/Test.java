package app_3_57a;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {

		//  this first code i do not understand
		
     /*  
        Stream<Integer> s1  = Stream.of(2,3,5,7,11,13,17,19);
		
        Stream<Integer> s2  = s1.collect(Collectors.partitioningBy(i -> { return i > 5 && i < 15; })
                              	                       ).get(true).stream();
       
        s2.forEach(System.out::println);
        
        System.out.println("-----------------------------------------------");
       */ 

        Stream<Integer> s3  = Stream.of(2,3,5,7,11,13,17,19);
		
        Stream<Integer> s4 = s3.map(i -> i>5 ?  i<15 ? i : null : null);
        s4.forEach(System.out::println);
        
	}

}
