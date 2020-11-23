package app_1_61;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Test {

	public static void main(String[] args) {

		List<String> sList = Arrays.asList("aa", "a", "aaa");
		
		Function<String, Integer> f = x -> x.length();
		
		Consumer<Integer> c = x -> System.out.println("-- " +x +" --");
		
		sList.stream().map(f).forEach(c);
		
/*
  easy to understand,     .map( function)     and   .foEach( Consumer );  
  
  
 		
 */
		

		
		
	}

}
