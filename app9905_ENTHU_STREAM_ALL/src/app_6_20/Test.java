package app_6_20;

import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(100,200,230,291,43);
		
		System.out.println(list.stream()
				             .map(  i -> i < 200 )  //  as the condition return true/false   it does not effect
				             .count()               // .map() method   it takes all the values and five further
				          );
		
		
		System.out.println("-----------------------");
				
		
		
		System.out.println(list.stream()
	             .filter(  i -> i < 200 )  //  .filter() method is the correct method and according to 
	             .count()               // condition it return the values
	          );
	
		
	
	/*	System.out.println(list.stream()
	                           .reduce(  i -> i < 200 )  //  we can not put  true/false condition in the reudce() 
	                           .count()                 //  method it gives compilation error
	          );
	*/
	
	
	
	}

}
