package app_5_87;

import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;

public class Test {

	public static int operate(IntUnaryOperator iuo) {
		return iuo.applyAsInt(5);
	}
	
	public static void main(String[] args) {
        //                                20 -> 5 -> 20 - 5
		IntFunction<IntUnaryOperator> fo = a -> b -> a - b;
	
	 int x= operate(fo.apply(20));

	 System.out.println(x);
	
	}

}
