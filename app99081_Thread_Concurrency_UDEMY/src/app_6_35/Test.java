package app_6_35;

import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		List<String> l = Arrays.asList("A","B","C","D","E","F");
		
		System.out.println(l.stream().isParallel());
		
		
		System.out.println(l.stream().parallel().isParallel());      // line 1

		
		System.out.println(l.parallelStream().isParallel());         // line 2
	
	}}

/* Note:   l.stream().parallel()   and    l.parallelStream()           these both method return
 
   ParallelStream.   we can say these both are same we can use any method.



*/