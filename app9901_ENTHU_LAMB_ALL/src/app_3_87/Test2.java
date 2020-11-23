package app_3_87;

import java.util.function.UnaryOperator;

public class Test2 {

	public static void main(String[] args) {

		String v1 = " hello";
		String v2 = new String("world-");
		
		UnaryOperator<String> v3 = s1 -> s1.concat(v1);
		UnaryOperator<String> v4 = s2 -> s2.toUpperCase();
		
    	System.out.println(v3.apply(v4.apply(v2)));
		
	}

}
// as StringBuilder and StringBuffer do not extends from String, as UnaryOperator can take a 
// object and return also  the same object. but as they are not same so compilation error.