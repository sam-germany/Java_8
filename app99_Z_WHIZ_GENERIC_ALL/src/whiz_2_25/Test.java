package whiz_2_25;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {

		List<String> l = new ArrayList<>();
		
		l.add("A");
		l.add("a");
		l.add("c");
		l.add("b");
		l.add("Bb");
		
		
		l.stream().forEachOrdered(System.out::println);    
	                                                     	
	                                                 
		
		Stream.of(l).forEachOrdered(System.out::println);
		
		
		
		Stream.of(l).forEach(System.out::println);

// but  as we use  .forEachOrdered();  but still the output is unodered  output.	
	}

}
