package app_3_50;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {

		IntStream s = IntStream.of(1,2,3,4);
		
		System.out.println(  s.peek(x -> --x)
				              .peek(System.out::println)
				              .sum()             
				       );
		
		System.out.println("---------------------");
		
        
		IntStream s2 = IntStream.of(1,2,3,4);
		
		System.out.println(  s2.map(x -> --x)
			                	.peek(System.out::println)
				               .sum()             
				       );
		
		
		
		//  this shows that changes done in the .peek()  method are not permanent changes they are just
		// reflected inside the   .peek()  method
	}

}
