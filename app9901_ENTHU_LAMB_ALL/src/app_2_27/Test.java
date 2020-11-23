package app_2_27;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class Test {

	public static void main(String[] args) {

		BiPredicate<String, Integer> bip = (x,y) -> x.length() > y;
		
		BiFunction<String, Integer, String> bif = (x,y) -> {
			                                                 
			                                            if(bip.test(x, y)) {
			                                                	 return x.substring(0, y);
			                                                               }
			                         
			                                               else return x;
		                                                  };
		                                                  
		                                                  
    String str = bif.apply("hello world", 5);
    System.out.println(str);
	}

}
