package app_4_9;

import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		List<Double> dList = Arrays.asList(10.0 , 12.0);
		
		dList.stream().forEach( x ->{  x = x+10;     //  as we use Arrays.asList() then the changes done in Lambda
		                              System.out.println(x);  // expression will not be reflected in the   List<>
		                            });
		
		dList.stream().forEach(System.out::println);   // hier we create a new Stream and values are still same

		
		
		
		List<StringBuilder> dList2 = Arrays.asList(new StringBuilder("a1"),
				                                   new StringBuilder("a2")               
				                                  );
		
		dList2.stream().forEach( x -> x.append("---b")); // but if we use StringBuilder then changes will be reflected
		                                               //  on the Arrays.asList()   see the output
		dList2.stream().forEach( x -> System.out.println(x));
		
		
		
		
		
	}

}
