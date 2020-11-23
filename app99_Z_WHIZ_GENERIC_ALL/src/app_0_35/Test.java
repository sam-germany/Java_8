package app_0_35;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {

		List l = Arrays.asList(new Integer[] {3,4,5,6,7,8});
		
	Map<Integer , List<Integer>> map =  (Map<Integer, List<Integer>>) l.stream()
	                                         .collect(Collectors.groupingByConcurrent(i -> i % 2 == 0 ? 1:2));
	
	
	
	
	
		// no need to check this example  somehow i do not understand it
		
	}

}
