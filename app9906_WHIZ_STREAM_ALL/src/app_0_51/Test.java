package app_0_51;

import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {

		Stream<String> s= Stream.of("A","B","C");
	
	     boolean b = s.peek(System.out::print)
	    		      .allMatch(x -> x.length()==1);
	     
	     System.out.println("  " + b);

	     
	     
	     Stream<String> s2 = Stream.of("A","B","CA");
	 	
	     boolean b2 = s2.peek(System.out::print)
	    		        .allMatch(x -> x.length()==1);
	     
	     System.out.println("  " + b2);
	     
	     
	     
	     
	     
	}

}
