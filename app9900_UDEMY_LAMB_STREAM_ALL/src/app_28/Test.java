package app_28;

import java.util.function.BiFunction;

public class Test {

	public static void main(String[] args) {
		
//		BiFunction<String, String, String> bf = String::concat;     hier in this type we can to add trim() method 
                                                               // we need  Lambda expression
		
		BiFunction<String, String, String> bf = (s1,s2) ->s2.concat(s1).trim();
	
		System.out.println(bf.apply(" cc", " ss"));
		
	}

}
