package app_5_57;

import java.util.function.Function;

public class Test {

	public static void main(String[] args) {

		Function<Integer, Double> fun = x -> x.doubleValue() * 2;
		
		System.out.println(fun.compose( (Integer x) -> x+2).apply(10));
		
	}}

/* the main point hier is ( (Integer x) -> x+2)    as we take in Function as Integer so this is the reason
 * we need to define the  (Integer x)   if we directly use  ( x -> x+2 )    then we will get error

  
  
 */
