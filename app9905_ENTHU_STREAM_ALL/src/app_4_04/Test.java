package app_4_04;

import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		List<Integer> ls = Arrays.asList(1,2,3);
	
		double s =  ls.stream().reduce(1, (a,b) -> a+b);
		System.out.println(s);

		System.out.println("----------------------------");
		
		double s1= ls.stream().mapToInt(x ->x ).sum();
		System.out.println(s1);
		
		
		System.out.println("----------------------------------");
		
		double d = 0;
//  	ls.stream().forEach(x  ->  { d  = d + a; }  );  // as d is not a final so we can not modify it
		                                                 // if we define d inside the forEach() then i works
	}

	
}
