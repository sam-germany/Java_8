package app_0_59;

import java.util.function.Function;

public class Test {

	public static void main(String[] args) {

		Function<String, Double> f = Double::parseDouble;    // f  =  x-> Double.parseDouble(x);
		
		System.out.println(f.andThen(s -> s * 2).apply("5"));
		
		
		
		// it takes   "1"  string as argument and after that parse  it into double and  * 2
	}

}
