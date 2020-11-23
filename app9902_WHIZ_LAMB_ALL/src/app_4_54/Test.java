package app_4_54;

import java.util.function.DoubleUnaryOperator;

public class Test {

	public static void main(String[] args) {

		
		DoubleUnaryOperator f = x -> Math.pow(x , 2);   // it return  powerof  3*3    = 9 as output
		                                                // as we use Double   so  9.0  as output
		System.out.println(f.applyAsDouble(3));
		
		
		
	}

}
