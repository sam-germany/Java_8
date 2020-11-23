package app_4_74;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {

		List<String> l1 = Arrays.asList("j","a","v","a");
		
		UnaryOperator<String> u1 = str ->str.toUpperCase();
		l1.replaceAll(u1);
		l1.forEach(System.out::print);
		
		
		List<String> l2 = Arrays.asList("j","a","v","a");
		
		l2.forEach( x ->System.out.print(x.toUpperCase()));

		
		
		List<String> l3 = Arrays.asList("j","a","v","a");
	
		System.out.print(l3.stream()
				           .collect(Collectors.joining())
				           .toUpperCase()
				         );
		
	}

}
