package app_0_47;

import java.util.OptionalDouble;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {

		Stream<Integer> s = Stream.of(2,9,44,12);
		
		OptionalDouble av = s.skip(2)                       // it skips the first 2 elements
				             .mapToInt(i -> i.intValue())
				             .average();
		
		System.out.println(av);
		
		// .average() method is defined in IntStream so need hier   .mapToInt() otherwiese error
		
	}

}
