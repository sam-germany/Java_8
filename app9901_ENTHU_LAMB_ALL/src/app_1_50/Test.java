package app_1_50;

import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		List<Integer> str = Arrays.asList(2,3,1,4);
		
		     str.stream()
		        .filter( x-> {
		        	        System.out.println(x + " ");
		        	        return x > 2;                  // Note: in   .filter() if we put {} flower brackets
		                    })                           // then at end we must use   return   keyword to 
	           .count();                              // to return a value.
	 }
	                       // i just put .count() only for evaluating the Stream.
}
