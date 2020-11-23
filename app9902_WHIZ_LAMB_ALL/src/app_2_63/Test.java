package app_2_63;

import java.util.function.IntBinaryOperator;

public class Test {

	public static void main(String[] args) {

		IntBinaryOperator ibo = Integer::compare;
		int x = ibo.applyAsInt(10, 11);
		
		System.out.println(x);
			
		
	}

}
