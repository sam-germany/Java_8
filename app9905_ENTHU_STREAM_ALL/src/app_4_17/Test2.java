package app_4_17;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test2 {

	public static void main(String[] args) {

		List<Integer> s1 = Arrays.asList(2,3,5,7,11,13,17);
		Stream<Integer> s2 = s1.stream();
		
		Predicate<Integer> test1 = k -> k < 10 ;
		
		s2.collect(Collectors.partitioningBy(test1, Collectors.counting()))
	      .keySet().forEach(System.out::println);     // keys are  false  3
		                                              //           true   4    according to condition
		
		System.out.println("---------------------------------");
		
		
		List<Integer> s3 = Arrays.asList(2,3,5,7,11,13,17);
		Stream<Integer> s4 = s1.stream();
		
		Predicate<Integer> test2 = k -> k < 10 ;
		
		
		
		s4.collect(Collectors.partitioningBy(test2, Collectors.counting()))
		  .values().forEach(System.out::println);
		
		
	// just try to draw this code in mind	

	}

}
