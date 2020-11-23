package app_5_74;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Test {

	public static void main(String[] args) {

		List<Integer> l = Arrays.asList(10,47,3,23,5);
		
  Optional<Integer> m1   =  l.stream().max(Comparator.comparing(a->a));   // as Stream.max() method return Optional
	 	System.out.println(m1);                                       // if we do not use .get() method in both  case it will
                                                                         // give us compilation error
		                                                                 //because we are using
		int m2   =  l.stream().min(Comparator.comparing(a->a)).get();    // int m1     not      Optional<Integer>
	     System.out.println(m2);
	     
	     
	     System.out.println("-------------------");
	     
	     Optional<Integer> x1 = l.stream().reduce((x,y) -> x > y? x:y);      // normally .reduce() method i take only for
         System.out.println(x1);	                                          // concatning till now, but in this way we can
	                                                                         // use it for comparing 2 values also
         System.out.println("-------------------");
	     
	     List<String> l2 = Arrays.asList("a","d","c");
	     
	     String m3 = l2.stream().max(Comparator.comparing(a -> a)).get();
	     System.out.println(m3);
	     
	     String m4 = l2.stream().min(Comparator.comparing(a -> a)).get();
	     System.out.println(m4);
	     
	     
	     
		 
	}

}
