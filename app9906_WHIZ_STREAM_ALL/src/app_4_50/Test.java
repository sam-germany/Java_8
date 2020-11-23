package app_4_50;

import java.util.Optional;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {

		Stream<String> st1  = Stream.of("10","20","30");
		
		boolean out = st1.anyMatch( s -> {
		                                   System.out.println(s);
		                                 
		                                   return   s.length() >= 20;
	                     	
		                                  });
		
		System.out.println(out);
	}

}
//  .allMatch();   it clearly shows that it check all the elements ony by one in the Stream
//                  at end it, it does not effect either the checking eement return true of false