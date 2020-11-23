package appp_106;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Test {

	public static void main(String[] args) {

		List<Boolean> l = Arrays.asList(false, new Boolean(null), new Boolean("0") );
	
		BinaryOperator<Boolean> operator = (b1, b2) ->b1 || b2;
		
		System.out.println(l.stream().reduce(false, operator));
		
		
		List<Boolean> l2 = Arrays.asList(false, new Boolean(null), new Boolean("tRue") );
		
		BinaryOperator<Boolean> operator2 = (b1, b2) ->b1 || b2;
		
		System.out.println(l2.stream().reduce(false, operator2));
	
	
	}

}
