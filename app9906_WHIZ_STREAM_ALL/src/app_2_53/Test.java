package app_2_53;

import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {

		Stream<Integer> s = Stream.of(2, 0, 4, 1);
		
		System.out.println(s.peek(x -> x++));
	}

}
