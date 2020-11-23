package app_48;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		int ref = 10;
		List<Integer> l = new ArrayList<>();
		
/*		l.stream().anyMatch( i -> {
			                  System.out.println("hello");
			                  return i> ++ref; 
		                      });
*/ 
	// as ref is a local variable used in lambda but it is effectively final so we can not increment, decrement it	
	
	
	
	    l.stream().anyMatch( i -> {
                              System.out.println("hello");
                                return i> ++i; 
                           });
 
	    // as  i is local variable inside Lambda express so we are allowed to change the value it is not final
}
	
	
}
