package app_1_66;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Test {                      //   .compose( before );

	public static void main(String[] args) {

		Function<Integer,Integer> f1 = x -> x * 5;   // (2) second this is called   8*5 =40 output
		Function<Integer,Integer> f2 = x -> x * 4;  // (1) first this is called   2*4 = 8 
		                                            // just for understanding i make it so how the call 
		Function<Integer,Integer>f3 = f1.compose(f2); // works in  .compose method
		
		System.out.println(f3.apply(2));
 		
	
		
		
		
		
		UnaryOperator<Double> up1 = d -> d+2;
		UnaryOperator<Double> up2 = d -> d+3;
		
//		UnaryOperator<Double> up3 = up1.compose(up2);
//		System.out.println(up3.apply(2.1));
		
	}

}
