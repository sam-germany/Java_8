package app_07;

import java.util.function.Function;

public class Test {

	public static void main(String[] args) {

		
	// Function<char[], String> obj = x -> new String(x);	
		Function<char[], String > obj = String::new;
		
		String s = obj.apply(new char[] {'b','c','a','d'});
		
		System.out.println(s);
	}

}
