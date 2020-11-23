package app_34;

import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {
    
		List<Integer> list = Arrays.asList(10, 100, 1000);
        
		list.replaceAll(i -> -i++);
 
        System.out.println(list);  // Line 1
        
        
        System.out.println(list);  // Line 2
        
        
        for( int x: list) {            // Line 3
        	System.out.println(x);
        }
}}

/*  Read Explanation  
   
  the point is all 3 time still we are calling the same list, so this is the reason we are
 
 
   getting the -10, -100, -1000   not -11, -101 , -1001    these  output we are not getting.


   just draw in mind 


*/