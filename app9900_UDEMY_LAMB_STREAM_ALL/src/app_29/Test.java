package app_29;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class Test {

	public static void main(String[] args) {
		                                                            //   Lambda expression is same
	//	BiPredicate<String, String> bp = (s1,s2) -> s1.contains(s2);            
                                  
		BiPredicate<String, String> predicate = String::contains;
		BiFunction<String, String, Boolean> bf  = (s1, s2) -> {
			                                                   return predicate.test(s1, s2) ? true:false;
		                                                      };
	
		  System.out.println(bf.apply("abcdef",  "cd"));                                                    
	
	}

}
