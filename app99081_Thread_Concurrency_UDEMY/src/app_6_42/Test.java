package app_6_42;

import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {

		Stream<String> s1 = Stream.of("J","A","V","A");
		
		String s2  = s1.parallel().reduce(String::concat).get();
		
		System.out.println(s2);
		
	}

}
/* 
   as we are using .reduce() method without and base/identity value, so all the elements coming
   out form Stream<String> are same, with the   .parallel() method we will see the difference
   when we want to   combine the Stream with any  base/identity  the we will see the difference
   otherwise it give us same output as  sequentional()   Stream or  parallel()   stream
     
   
   as defined in the Enthuware  their are 2-3  types of .reduce() method, if we do not define
 
 
   any base value then this .reduce() method return   Optional, so as shown in this case we use
   
   .get()    method to get the returned   Optional value
    
 
       
 




*/