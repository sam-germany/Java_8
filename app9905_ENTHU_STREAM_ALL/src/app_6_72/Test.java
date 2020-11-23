package app_6_72;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {

		List<Integer> names = Arrays.asList(1,2,3);
	 
		System.out.println(names.stream()
				                .mapToInt(x -> x)
				                .sum());
		
		
		           names.stream()
		                .forEach((sum) -> sum = sum + 10 );  // if we change like this then it compile , read 
		                                                     // explanation why in question it is not compiling
		        
       		System.out.println(names.stream()
		     		                .reduce(0, (a,b) -> a+b));
		
		
		     System.out.println(names.stream()
		    		                 .collect(Collectors.mapping(x -> x, Collectors.summarizingInt(x -> x)))
		    		                 .getSum()); // must read all 4 lines of Explanation  
		     
		     
		     
	     	System.out.println(names.stream()
	     			                .collect(Collectors.summarizingInt( x -> x))
	     			                .getSum());
	     	
	     // must read all 4 lines of Explanation  	     	
	
	}

}
