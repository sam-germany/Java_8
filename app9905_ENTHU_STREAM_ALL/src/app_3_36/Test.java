package app_3_36;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Test {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Peter", "Paul", "Pascal");
		
	            	boolean ops = names.stream()
				                             .parallel()
				                             .allMatch(name -> name != null);
		
	            	System.out.println(ops);
	            	
	            	Optional<String> op = names.stream()
	            			                           .parallel()
	            			                           .filter(name -> name.length()> 33)
	            			                           .findAny();
		System.out.println(op);
	}

}
