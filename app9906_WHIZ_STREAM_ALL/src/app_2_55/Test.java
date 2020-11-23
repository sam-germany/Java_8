package app_2_55;

import java.util.stream.IntStream;

public class Test {

	public static void main(String[] args) {

		IntStream ints = IntStream.of(2,4,6);
		
		System.out.println(    ints.filter(x -> x < 0)
				                   .findFirst()
				           
				          );
	}

}

// .findFirst() return Optional