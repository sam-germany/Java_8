package app_74;

import java.util.Arrays;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {

		Stream<Double> s1 = Arrays.asList(1.8,2.3,3.1,4.1).stream();
		
 //     System.out.println(s1.reduce(0.0,(x , y) -> x + y));
		
		System.out.println(s1.reduce(0.0 , Double::sum));
		
		
		
		
		
		        Stream<Integer> s2 = Arrays.asList(1,2,3,4).stream();
		
		 //     System.out.println(s2.reduce(0.0,(x , y) -> x + y));
				
				System.out.println(s2.reduce(0 , Integer::sum));
		
	}

}
