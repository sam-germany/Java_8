package app_3_61;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {

		Stream<String> st = Stream.of("SE","EE","ME");
		
		Stream<Integer> l = st.flatMap(s -> Stream.of(s.length()));
		
		System.out.println(l.collect(Collectors.toSet()));
		
	}

}
