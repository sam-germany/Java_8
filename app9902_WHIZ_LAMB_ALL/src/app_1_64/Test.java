package app_1_64;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Test {

	public static void main(String[] args) {

		BiFunction<Integer, Double, String> bf = (i,d) -> i.doubleValue() + d + " ";
		
		Function<String, Double> fun = Double::parseDouble;
		
//		double d = bf.compose(fun).apply(2,3.2)
		
// in BiFunction their is not  method  .cómpose();   this is the reason i do not write further code.
// no need to check  further this code.
	}

}
