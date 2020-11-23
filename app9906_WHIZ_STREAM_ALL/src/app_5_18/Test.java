package app_5_18;

import java.util.stream.IntStream;

public class Test {

	public static void main(String[] args) {

		IntStream   is = IntStream.rangeClosed(1, 3);
		
		           is.peek( x -> System.out.println( x*2 +"=="))
		           
		             .forEach(x-> System.out.println(x  +"---"));
	}

}

// this code clearly shows that and changes done in .peek() method will not be reflect further
//  .peek() method is only for developer for debugging