package app_83;

import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {

		Stream<String> s = Stream.of("aa","d","cc","xx");
		
	//	Set<String> set = s.collect(Collectors.toCollection( () -> new TreeSet()));
		
		Set<String> set = s.collect(Collectors.toCollection(TreeSet::new));   // both types will work correctly
	                                                  
		                                     // Note   we use hier TreeSet::new     not TreeMap 
		System.out.println(set);
	}

}
