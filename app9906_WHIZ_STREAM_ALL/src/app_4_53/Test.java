package app_4_53;

import java.util.Optional;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {

		Stream<Integer> s = Stream.of(12,40,11,22);
		
		Optional<Integer>  op =  s.filter(  i  -> i%2 ==0)
	                              .min( ( x,y) ->  Integer.compare(x,y) );
		
		System.out.println(op);
	
		
		System.out.println("---------------------");
		
		
        Stream<Integer> s2 = Stream.of(12,40,11,22);
		
	             	int  op2 =  s2.filter(  i  -> i%2 ==0)
	                              .min( ( x,y) ->  Integer.compare(x,y) )
	                              .get();
		
		System.out.println(op2);
	
	} 

}
