package app_27;

import java.util.function.BiFunction;

public class Test {

	public static void main(String[] args) {
		
//	     BiFunction<String, String, String> bf = (s1,s2) -> s1.concat(s2); 
		
         BiFunction<String, String, String> bf = String::concat;
		
		 System.out.println(bf.apply("sunn", "-xxx"));
	}

}
