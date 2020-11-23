package appp_101;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Test {

	public static void main(String[] args) {

		List<Integer> l = Arrays.asList(-80 ,100 ,-40 ,25 ,200);
		
		Predicate<Integer> predicate1  =  x -> {
			                           int ctr = 1;
			                           boolean result  = x >0;
			                           System.out.println(ctr++  + " ");
			                           return result;
		                              };
		
		l.stream().filter(predicate1).findFirst();                              
	
	// very easy to understand   i wrote in copy
	
	}

}
