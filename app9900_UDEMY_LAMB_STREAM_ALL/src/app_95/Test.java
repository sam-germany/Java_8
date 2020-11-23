package app_95;

import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {

		Stream<Double> s = Stream.generate( () -> new Double("1.0"));
		
		System.out.println(s.sorted().findFirst());
	
	 
		System.out.println(s.findFirst()); // if we just use this without .sorted() then 
                                           //		er get  a value and operation is terminated
	}

}
