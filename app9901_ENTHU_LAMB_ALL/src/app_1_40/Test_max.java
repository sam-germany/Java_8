package app_1_40;

import java.util.Arrays;
import java.util.List;

public class Test_max {

	public static void main(String[] args) {

		List<Integer> l = Arrays.asList(4,2,6,9,2,5,7);
		System.out.println(l.stream());               // for a .stream() we must use  .forEach()   method
        l.forEach(System.out::println);      
        
        System.out.println("--------------++");
		
		System.out.println(l.stream().reduce(Integer.MIN_VALUE, (a,b) -> a>b ? a : b));
		// just for understanding purpose i pass peek()  method hier
		
		
		System.out.println(l.stream().reduce(Integer.MAX_VALUE, (a,b) -> a>b ? a : b));
		
		System.out.println(l.stream().max((a,b) -> a>b ? a : b));  // hier we are not comparing all the values
                                                                   // as .max(Comparator); but we are passing 
                                                       // a Lambda Expression so it return the first value only
                                    //Arrays.asList(1,2,6,9,2,5,7);   if we put list like this then  1  as output  
		
		
        System.out.println("*********");
		
		System.out.println(l.stream().max(Integer::max)); // it return   Optional[2]  as  .max(Comparator)  and
		                                                  // comparator we need  2 arguments but hier 
		                                                  // (Integer::max) take only one argument so we get
		                                                  // the first value as output
		
		System.out.println(l.stream().max(Integer::compare));     // it return Optional[9]
		System.out.println(l.stream().max(Integer::compare).get());  // it return also Optional but with .get()
		                                                            // it return object  that is inside Optional
		
		System.out.println("################");
		
		System.out.println(l.stream().max((x,y) -> x.compareTo(y)));       
		
		System.out.println(l.stream().max((x,y) -> x.compareTo(y)).get()); 
		
	}}