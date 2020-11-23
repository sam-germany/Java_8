package app_6_37;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class Test {

	public static void main(String[] args) {

		List<Integer> l1 = Collections.synchronizedList(new ArrayList<>());
	
		IntStream  s1 = IntStream.rangeClosed(1, 7);
		
		         s1.parallel()                  //hier we use .parallel() method,just draw in mind how it flow goes
		           .map(x -> {
		        	        l1.add(x);
		        	        return  x;          // when we use {} curly brackets in .map() then we have
		                     })                         // to use return   keyword for returning value
	               .forEach(System.out::println);
		         
		         System.out.println("--------------");
		         
		         l1.forEach(System.out::println);
		
		         
		System.out.println("=========================");
		
		List<Integer> l2 = Collections.synchronizedList(new ArrayList<>());
		
		IntStream  s2 = IntStream.rangeClosed(1, 7);
		
   		         s2.map(x -> {                            // hier is  sequential Stream
		        	        l2.add(x);
		        	        return  x;
		                     })
	              .forEach(System.out::println);
		         
		         System.out.println("--------------");
		         
		         l2.forEach(System.out::println);
		
		
		
		
		
		
		
		
		
		
		
	}

}
