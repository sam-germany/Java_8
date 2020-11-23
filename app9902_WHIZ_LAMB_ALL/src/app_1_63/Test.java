package app_1_63;

import java.util.function.BinaryOperator;

public class Test {

	public static void main(String[] args) {

		BinaryOperator co = BinaryOperator.maxBy(Integer::compare);
		
		System.out.println(co.apply(5, 10));
		
		
		
        BinaryOperator co2 = BinaryOperator.minBy(Integer::compare);
		
		System.out.println(co2.apply(5, 10));
	}

}

// BinaryOperator has 2 static methods    .minBy(Comparator);     and   .mayBy(Comparator);
