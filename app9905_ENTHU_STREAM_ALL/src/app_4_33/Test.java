package app_4_33;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Test {

	public static void main(String[] args) {

		List<String> ls = Arrays.asList("Tom Cruise", "Tom Ha88", "Tom Hanks", "Tom Brady");
		
		Predicate<String> p = str -> {
			                      System.out.println("Looking.....");
			                      return str.indexOf("Tom") > -1;
		                            };
		                            
		 boolean flag = ls.stream()
				          .filter(str -> str.length() > 8 ).allMatch(p);                           
		                            
		 
		 System.out.println("--------");
		 
		 String x = "Tom";
		 System.out.println(x.indexOf("Tom"));
	}

}
// main point to understand is .allMatch() will continue searching till the (predicate)  return true
