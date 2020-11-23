package app_2_65;

import java.util.function.Function;

public class Test {

	public static void main(String[] args) {

		Function<Double, Double> f  = Function.identity(); // input   output  must be of same datatype
		
		System.out.println(f.apply(10.0));
	}

}
