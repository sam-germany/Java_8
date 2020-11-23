package app_4_49;

import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {

		Stream s = Stream.of(10,20,"30");
		
		boolean b = s.allMatch( x -> x instanceof Number);  // String class does not extend from Number
		                                                    // so it return false
		System.out.println(b);
		
		
		System.out.println("------------------");
		
		
	    Stream s2 = Stream.of(10,20);
		
		boolean b2 = s2.allMatch( x -> x instanceof Number);
		
		System.out.println(b2);
		
	}

}
