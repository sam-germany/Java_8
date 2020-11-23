package app_3_45;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {

		Stream<Integer> values = IntStream.rangeClosed(10, 15).boxed();
		
		Object obj = values.collect(Collectors.partitioningBy( x -> x % 2==0));
		
		System.out.println(obj);
		
	}

}
