package app_30;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class Test {

	public static void main(String[] args) {

		BiFunction<String, String, String> func = (s1, s2) ->{
			                                            return (s1 + s2);
		                                                     };
		
	    BiPredicate<String, String> predicate = (s1,s2) -> {
	    	                                 return func.apply(s1, s2).length() > 10;
	                                             };
		
	    String[] arr = {"vention", "-historic", "sss","dddddd"};
	    
	    for(String str: arr) {
	    	if(predicate.test("pre", str)) {
	    		System.out.println(func.apply("pre", str));
	    	}
	    }
	}

}
