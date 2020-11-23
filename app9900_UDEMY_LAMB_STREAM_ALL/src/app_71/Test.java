package app_71;

import java.util.stream.IntStream;

public class Test {

	public static void main(String[] args) {
		int res = 1;

		IntStream s = IntStream.rangeClosed(1, 5);
		
	//	System.out.print(s.reduce(1, (x, y) -> x * y));   // output    120
	
	//    System.out.print(s.reduce(0, (x , y) -> x * y));  // output is 0

//	    System.out.println(s.reduce(res ,(x , y) -> x * y ));   // output is  120
	    
	    
	  //  System.out.println(s.reduce(1, Integer::multiply));   no method is their like multply 
  	                                                          // in Integer class
	}

}
