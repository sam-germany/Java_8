package app_77;

import java.util.Comparator;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {

		// way 1
		Comparator<Integer> comp = (x,y) -> x.compare(x,y);
		Stream<Integer> s = Stream.of(55,23,9,8,42);
	   
		 s.sorted(comp.reversed())
		  .forEach(i -> System.out.println(i + " ")); 

	
		 // way 2
		 Comparator<Integer> comp2 = (x,y) -> x.compareTo(y);
			Stream<Integer> s2 = Stream.of(55,23,9,8,42);
		   
			 s2.sorted(comp2.reversed())
			  .forEach(i -> System.out.println(i + " "));
	  
	
	}

}
