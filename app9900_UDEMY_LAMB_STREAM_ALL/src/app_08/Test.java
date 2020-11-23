package app_08;

import java.util.function.Function;

public class Test {

	public static void main(String[] args) {

		Function<Integer, Integer> f = x -> x + 10;
		Function<Integer, Integer> g = y -> y * y;
		

		
		Function<Integer, Integer> fog = g.compose(f);    //  400
		System.out.println(fog.apply(10));
		
		
		Function<Integer, Integer> fog1 = f.andThen(g);   //  400
	    System.out.println(fog1.apply(10));
		
	    Function<Integer, Integer> fog2 = f.compose(g);  //   110
	    System.out.println(fog2.apply(10));
	    
	    Function<Integer, Integer> fog3 = g.andThen(f);   //  110
	    System.out.println(fog3.apply(10));

	     
//		Function<Integer, Integer> fog = g.compose(before)	 check this is the decleration
	}  //                               (before) will be execute first then   g    will be executed

}
