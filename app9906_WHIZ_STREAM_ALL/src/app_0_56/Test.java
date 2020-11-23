package app_0_56;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {

		Stream<String> l = Stream.of("ABC", "aBB", "AbCC", "ab","acC");
		
		Map<Boolean , List<String>> m = l.collect(Collectors.partitioningBy((String s) -> s.startsWith("ab")));
		
		System.out.println(m);
		
	}

}
