package app_3_87;

import java.util.function.UnaryOperator;

public class Test {

	public static void main(String[] args) {

		String v1 = "hello";
		StringBuilder v2 = new StringBuilder("world");
		
		UnaryOperator<String> v3 = s1 -> s1.concat(v1);
		UnaryOperator<String> v4 = s2 -> s2.toUpperCase();
		
    	System.out.println(v3.apply(v4.apply(v4)));
		
	}

}
