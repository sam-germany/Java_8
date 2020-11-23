package app_96;

import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {

		Stream<Double> s = Stream.generate( () -> new Double("1.0"))
	                             .limit(10);
		
		System.out.println(s.filter ( d ->  d>2 ).allMatch( d   -> d == 1)      );
	
		// .generate() method generate 10 times   "1.0"
		
		// the point hier to understand that .filter()  return false as every  so the .allMatch() method is 
		//  is empty and    allMatch() return  true is calles on empty stream.
	
	}

}
