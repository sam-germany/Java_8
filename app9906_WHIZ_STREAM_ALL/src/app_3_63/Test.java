package app_3_63;

import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {

		Stream<String> st = Stream.of("A","BB","CCC");
		
		Stream<Integer> out = st.map(x -> x.length() );
		
//      Stream<Integer> out = st.map(String::length);
		
		out.forEach(System.out::println);
		
	}

}
