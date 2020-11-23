package app_1_32;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Test {

	public static void main(String[] args) {

		List<Integer> ls = Arrays.asList(1,2,3);
	
		Function<Integer, Integer> func = x -> x*x;
		
		ls.stream()
		  .map(func)
		  .peek(System.out::println)
		  .forEach(System.out::println);;
	
	
	}

	
}
