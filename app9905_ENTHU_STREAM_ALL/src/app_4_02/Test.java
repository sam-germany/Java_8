package app_4_02;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {

		Stream< List<String> >  s1 = Stream.of(
				                                Arrays.asList("a","b"),          // obj 1           
				                                Arrays.asList("a","c")          // obj 2
				                               );
		
		Stream<String> s2 = s1.filter(s -> s.contains("c"))    //  filter  return false for obj 1   as it does not 
				              .flatMap(x -> x.stream());      // contain "c"   but  whole obj 2 will return true
		                                                      // as it contains "c"  and we get the   a c as result
		           s2.forEach(System.out::println);
		
	}

}
