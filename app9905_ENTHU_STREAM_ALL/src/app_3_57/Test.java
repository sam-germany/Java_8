package app_3_57;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {

		Stream<Integer> s1  = Stream.of(2,3,5,7,11,13,17,19);
		
		Stream<Integer> s2 = s1.filter(i ->{   return i >5 && i <15;   });
		s2.forEach(System.out::println);
		
		System.out.println("-------------------------------------");
		
		
        Stream<Integer> s3  = Stream.of(2,3,5,7,11,13,17,19);
		
        Stream<Integer> s4 = s3.parallel().filter(i -> i > 5 ).filter(i -> i<15).sequential();
        s4.forEach(System.out::println);
		
        
        System.out.println("------------------------------------------------------");
       
        Stream<Integer> s5  = Stream.of(2,3,5,7,11,13,17,19);
		
        Stream<Integer> s6  = s5.collect(Collectors.partitioningBy(i -> { return i > 5 && i < 15; })
                              	                       ).get(true).stream();
       
        s6.forEach(System.out::println);
        
	}

}
