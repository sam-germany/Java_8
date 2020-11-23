package app_1_55;

import java.util.stream.IntStream;

public class Test {

	public static void main(String[] args) {

		
		IntStream  i = IntStream.of(3, 2, 1, 5, 3);
		
		i.peek(System.out::println)
		 .allMatch(x -> x > 1);
	}

}
