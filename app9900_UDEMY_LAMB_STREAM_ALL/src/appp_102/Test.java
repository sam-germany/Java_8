package appp_102;

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
			
			l.stream().filter(predicate1).sorted().findFirst();                              
		
		// very easy to understand   first it sort all the values so for every value it print 1
	    // and as in the last a value is printed so .findFirst()  is also satisfied.
			
//	Note:  .sorted() method of Stream does not take any argument		
		
		}

	}