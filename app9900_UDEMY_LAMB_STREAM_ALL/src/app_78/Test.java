package app_78;

import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {

		Stream<String> s = Stream.of("d","cc","bbb","azaa");
	
	    s.sorted().forEach(System.out::println);
	
	}

}
