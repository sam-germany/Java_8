package app_3_39;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {

		List<Integer> l = Arrays.asList(new Integer[] { 1,2,3,4,5,6,7,8,9 });
		
		Map<Object, List<Integer>> m  = l.parallelStream()
				                         .collect(Collectors.groupingByConcurrent(i -> i% 2 == 0 ? 0 :1));
		
		System.out.println(m);
		System.out.println(m.get(0));
	
		
		System.out.println("------------------------");
		

		 List<Integer> l2 = Arrays.asList(new Integer[] { 1,2,3,4,5,6,7,8,9 });
		
		Map<Object, List<Integer>> m2  = l2.parallelStream()
				                         .collect(Collectors.groupingBy(i -> i% 2 == 0 ? 0 :1));
		
		System.out.println(m2);
		System.out.println(m2.get(0));
		
	}

}
// Note   both   Collectors.groupingByConcurrent()  and .groupingBy() both give us same output