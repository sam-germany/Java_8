package app_1_45;

import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		List<Integer> l = Arrays.asList(1,2,3,4,4,6,6);
		
		System.out.println(   l.stream()
				               .filter( e-> e %2==0)
				               .mapToInt( i ->i )  //   as .sum() method define in IntStream so we need 
				               .sum()               //  .mapToInt() 
				          );
	}

}
