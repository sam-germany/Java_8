package app_6_51;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {

		List<Integer> l1  = Arrays.asList(1,2,3,4,5,6,7);
		
		Predicate<Integer>  p =  x -> x % 2==0;
		
		List l2 = l1.stream()
				    .filter(p)
				    .filter(x -> x >3).collect(Collectors.toList());
		
		System.out.println(l2);
	}
	
	// we can write  List  l2 =     or         List<Integer> =     both are correct

}
