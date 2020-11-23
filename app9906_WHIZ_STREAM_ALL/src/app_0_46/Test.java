package app_0_46;

import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {

		Stream<Integer> s = Stream.of(10,5,22,4,12);
		
		System.out.println(  s.peek(System.out::println)
				              .noneMatch( i -> i  >= 4 ));
	
		
		// it checks the first elemnt it t does not match then condition return false and
		// it also return false
	}

}
