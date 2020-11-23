package app_81_82;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {

		Stream<String> s = Stream.of("java","python","c","c++","c++");
		
		List<String> l = s.sorted().collect(Collectors.toList());  // .collect() we use when we want to convert
		                                                          // the Stream of elements into a List
		System.out.println(l);
		
		
		
         Stream<String> s2 = Stream.of("java","python","c","c++","c++");
		
		Set<String> l2 = s2.collect(Collectors.toSet());  // .collect() we use when we want to convert
		                                                  // the Stream of elements into a Set
		System.out.println(l2);                           //  as Set does not alloweed duplicates , hier also        
		System.out.println(l2.size());                    // we put c++   2 times and in output only 1 time we get
	
	}

}
