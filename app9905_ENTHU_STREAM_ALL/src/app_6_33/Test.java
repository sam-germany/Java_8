package app_6_33;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {

		Stream<String> s1 = Stream.of("a","b","c","d","e");
		
		String s2= s1.collect(Collectors.joining(",","-","+"));
		
		System.out.println(s2);
	
	// just read the explanation and easy to understand
		
	}

}
