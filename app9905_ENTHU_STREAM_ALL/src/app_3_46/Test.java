package app_3_46;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {

		List<String> l1 = Arrays.asList("a","b");
		List<String> l2 = Arrays.asList("1","2");
		
		Stream.of(l1,l2).flatMap((x) -> x.stream()).forEach((x) -> System.out.println(x));
		
		System.out.println("----------------------------------------");
		
		Stream.of(l1,l2).flatMap((x) -> x.stream()).forEach(System.out::println);
		
	}

}
