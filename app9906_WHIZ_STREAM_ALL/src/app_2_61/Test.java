package app_2_61;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {

		Stream<Double> s = Stream.of(12.1, 12.5, 12.9);
		
		Stream<Integer> l = s.flatMap( x -> Stream.of(x.intValue() ));
		
		System.out.println(  l.collect(Collectors.toSet()));
	}

}
