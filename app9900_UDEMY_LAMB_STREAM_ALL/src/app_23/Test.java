package app_23;

import java.util.function.BiPredicate;

public class Test {

	public static void main(String[] args) {

	///	BiPredicate<String, String> p = (s1, s2) -> s1.equalsIgnoreCase(s2);  this is also valid
		
		BiPredicate<String, String> p = String::equalsIgnoreCase;
		
		System.out.println(p.test("aaaa", "AAAA"));
		
		
	}

}
