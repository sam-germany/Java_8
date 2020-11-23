package whiz_2_23;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {

		List<String> l = new ArrayList<>();
		l.add("2");
		l.add("3");
		l.add("1");
		l.add("4");
		l.add("5");
		
		Stream<Integer> ints = l.stream()
				                .map( s ->{  System.out.println(s);
		                
				                           return Integer.parseInt(s);
                                     		 });                         // hier .map() return Stream<Integer> back
		
	//	System.out.print(ints);
		System.out.println("total =  "+ints.count());    // .parseInt(); convert String to int and on int we
		                                              // can call   .count();   method.
	    
		
		
		 // note  as we do not use terminal operator then this stream will not be 
	}    // evalulated so nothing will be printed, so at end we use  on   ints.count();   the terminal operator.

}
