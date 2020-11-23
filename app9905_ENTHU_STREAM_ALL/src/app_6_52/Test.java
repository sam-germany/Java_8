package app_6_52;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class Test {

	public static void main(String[] args) {

		Map<String, String> m1 = new HashMap<>();
		
		m1.put("a", "x");
		m1.put("b", "x");
		
		BiFunction<String,String, String > f = String::concat;   // BinaryOperator<String > f = String::concat;
		                                                          // both are same
		m1.merge("b", "y", f);
		m1.merge("c", "y", f);
		
		System.out.println(m1);
		
		
		// Note as we know the key will never be merger only values will be merger as shown in above case
		
	}

}
