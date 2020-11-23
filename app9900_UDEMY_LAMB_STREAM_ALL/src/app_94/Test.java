package app_94;

import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {

		Stream<Double> s = Stream.of(1.5,2.5,6.5);
		
		System.out.println(s.min(Double::compareTo));
	}

}
