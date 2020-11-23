package app_44;

import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {

		Stream.of("a","b","c").map(x -> x.toString().toUpperCase()).forEach(System.out::println);
		
		Stream.of(true,false,true).map(x -> x.toString().toUpperCase()).forEach(System.out::println);
		
		
		Stream.of(3,3,4).map(x -> x.toString().toUpperCase()).forEach(System.out::println);
	}

}
