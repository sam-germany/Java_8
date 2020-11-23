package app_1_38;

import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		List<StringBuilder> list1 = Arrays.asList(new StringBuilder(),  
				                              new StringBuilder());
		
		
		
		         list1.stream()
		          .forEach(s -> s.append("helloworld"));     // in above List, hier we are adding in each StringBuilder
		                                                     //  "helloworld"
		        list1.forEach(s -> {
			                   s.insert(10, ",");             // as in List we have 2 objects then so we are inserting at 5 index
			                  System.out.println(s);         // as in our case length of string is 10 
	                     	});                             
	}                                                          // .insert(10 ,",")  alloweed
	                                                          // .insert(11 ,",")  exception
}


// we can not use   new String();   becuase String is imutable so we can not append it
// this is the reason String class does not have .append and .insert method