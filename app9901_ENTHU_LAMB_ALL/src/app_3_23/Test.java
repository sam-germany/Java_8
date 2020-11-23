package app_3_23;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Test {

	public static void main(String[] args) {

		List<Integer> values = Arrays.asList(2,4,6,9);
		
		Predicate<Integer> check = (i) ->{  
			                                    System.out.println("checking");
			                                       return i  == 4;  };
		                                          
		    
		     Predicate<Integer> even  = x ->   x % 2 == 0 ;	                                       
			  
		     
// Type 2    Predicate<Integer> even = (Integer i )-> i % 2 == 0;   // (Integer i )  if we want to define data type
		                                                            //      then we have to put brackets 
			                                       
// Type 3    Predicate even = i -> ((Integer)i)%2 == 0;
		       
		       
		       
// Type 3    Predicate even = (Object i ) -> (( Integer)i) %2 == 0;
		       
		       
		      System.out.println(    values.stream().filter(check).filter(even).count()  );
		
		
	}

}
