package app_1_49;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {

		Stream<String> s = Stream.of("12","13","3","1");
		
		Double avg = s.collect(Collectors.averagingInt( x -> Integer.parseInt(x)));
		
		System.out.println(avg);
		
		
		System.out.println("----------------------");
		
		
      
		
		Stream<Integer> s1 = Stream.of(12, 13, 3, 1);
		
		Double avg1 = s1.collect(Collectors.averagingInt(x -> x));
		
		System.out.println(avg1);
		
		// in this case we are directly passing int so no need to take  .parseInt()  
		//
	}

}
