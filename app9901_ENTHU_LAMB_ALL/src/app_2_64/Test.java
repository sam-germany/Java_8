package app_2_64;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;

public class Test {

	public static void main(String[] args) {
	
		
		 
		List<String> names = new ArrayList<>();
		names.add("bb");     
		names.add("ccc");
		names.add("aa");                          
		
		BinaryOperator<String> b1 = (s1, s2) -> s1.concat(s2);  // as till now we do with Lambda Expression now with
		                                                                                              // BinaryOperator
		
		
		                                             // as List<> is of String type so .reduce() method return String
		String finalvalue = names.stream()                  
				                  .reduce("Hello!  ", b1);  // in reduce() method as we use "Hello"  as 
 	 
		System.out.println(finalvalue);             // base identity/value now in our case it return String object
		
		
		System.out.println("---------------------");
		
		
 		String finalvalue2 = names.stream()
 				                  .reduce(b1)
 				                  .get();//  when we do not take identity/base value in the reduce() method
 		
 		System.out.println(finalvalue2);                 // then it will return a Optonal  to we need .get() to 
 		                                                  // take the object from Optional
 		
 		
 		
 		Optional<String> finalvalue3 = names.stream()
 			                   	            .reduce(b1);
 		
 		System.out.println(finalvalue3);
 		
 		
 // as we 

	}

}
