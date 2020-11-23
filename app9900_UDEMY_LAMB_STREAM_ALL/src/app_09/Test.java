package app_09;

import java.util.function.Function;

public class Test {

	public static void main(String[] args) {

		
		Function<String, Integer> f1 = Integer::new;
		Function<String, String> f2 =  s -> new StringBuilder(s).reverse().toString();
		
		System.out.println(f1.compose(f2).apply("12345"));
	
		
		System.out.println("-------------------");
		
		
		Function<String, Integer> x1 = x -> new Integer(x); 
    	Function<String, String> x2 =  s -> new StringBuilder(s).reverse().toString();
		
		System.out.println(x1.compose(x2).apply("12345"));
		
		
	}

}
