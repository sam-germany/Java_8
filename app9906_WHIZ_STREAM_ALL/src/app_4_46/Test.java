package app_4_46;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {

		Stream<Double> s  = Stream.of(2.2,2.8,2.5);
		
		IntStream out = s.mapToInt(x -> x.intValue());  //   .mapToInt()  convert the Stream into IntStream
		                                                //   as clearly show in this code
		System.out.println(out.distinct().count());
		
		
	}

}
