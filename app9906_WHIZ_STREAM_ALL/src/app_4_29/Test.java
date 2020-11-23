package app_4_29;

import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {

		Stream<String> st1 = Stream.of("A","AB","ABC","ABCD","AB").parallel();
		
		String out = st1.filter(s -> s.length() > 2) 
				        .filter( s -> s.indexOf("C") > -1)
				        .findAny()
				        .orElse("None");
		
		System.out.println(out);
		
	}

}
