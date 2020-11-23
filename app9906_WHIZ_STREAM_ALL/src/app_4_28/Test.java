package app_4_28;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {

		IntStream ints = IntStream.of(5,10,15);
		
		Stream s1 = ints.boxed().map(Integer::toString);
		
		System.out.println(s1.findAny());

	// main point is that we can not use anywhere    (Integer::toString)
		
	}

}
