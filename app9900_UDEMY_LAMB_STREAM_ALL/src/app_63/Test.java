package app_63;

import java.util.Random;
import java.util.stream.IntStream;

public class Test {

	public static void main(String[] args) {

		IntStream st = IntStream.generate( () -> new Random().nextInt(100))
				                                                          .limit(1);
		
		
		st.filter(i -> i > 0 && i < 1000).findFirst().ifPresent(System.out::println);
	}

}
