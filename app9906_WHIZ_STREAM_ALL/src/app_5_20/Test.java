package app_5_20;

import java.util.Optional;
import java.util.function.LongPredicate;
import java.util.function.Predicate;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {

		
		LongStream l1 = LongStream.rangeClosed(3, 6);
		
		LongPredicate p = l -> l%3 == 0;
		
		
		      l1.filter(p)
	        	.forEach(System.out::println);
		
		
	}

}
