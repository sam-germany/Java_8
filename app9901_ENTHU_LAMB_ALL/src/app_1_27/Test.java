package app_1_27;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class Test {

	public static void main(String[] args) {

		BiPredicate<String, Integer> bip  = (s,i) -> s.length() > i;
		
		BiFunction<String, Integer, String> bif = (s , i) ->{
			                                                  if(bip.test(s, i)) {
			                                                	  return s.substring(0, i );
			                                                  }
			                                                  else return s;                                  
		                                                   };
        
		                                                   
		String str = bif.apply("hello world", 3);
		System.out.println(str);
	
	}

}
