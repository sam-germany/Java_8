package app_4_17;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {

		List<Integer> s1 = Arrays.asList(2,3,5,7,11,13,17);
		Stream<Integer> s2 = s1.stream();
		
		Predicate<Integer> test1 = k -> k < 10;
		
		long count1 = s2.filter(test1).count();
		System.out.println(count1);
	
		
		
		Predicate<Integer> test2=  k -> k > 10;
	/*	long count2 = s2.filter(test2).count();
		System.out.println(count2);
		
		System.out.println(".........................");
		
     System.out.println(count1 +" "+count2);
  */
	}

}
