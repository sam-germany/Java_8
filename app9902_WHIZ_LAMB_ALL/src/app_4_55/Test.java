package app_4_55;

import java.util.function.IntBinaryOperator;

public class Test {

	public static void main(String[] args) {

		IntBinaryOperator inp  = (i1, i2) -> i1 /i2;
		
		System.out.println(inp.applyAsInt(3, 5));
		
	}

}
