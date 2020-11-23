package app_1_32;

import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {

		Stream s = Stream.of(2,3,4)
				         .parallel()
				         .sequential();
		 
		
		s.forEach(System.out::println);
	}

}
