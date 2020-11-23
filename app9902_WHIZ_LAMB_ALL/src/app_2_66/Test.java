package app_2_66;

import java.util.function.Function;

public class Test {

	public static void main(String[] args) {

		Function<Double, Integer> mul2 = d -> d.intValue();
		
		
		
		Function<Integer, String> f = in ->in.toString();
		
		Function<Double, String> func = f.compose(mul2);


		System.out.println(func.apply(12.6));
		
		System.out.println(func.apply(12.6).length());
 
             		// easy to understand first mul2 will be execute and return a int   as   12
		            //  after that f execute   take int 12  and return "12"   and  .lenght() we can 
	                // call only on String so we can  call it and we will get   2  as output
		
	}

}
