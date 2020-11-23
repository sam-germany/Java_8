package app_6_01;

import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		List<Character> l = Arrays.asList('U','R','A');
		
		        
		              l.stream()
		               .filter(x -> x=='A')
		               .peek(x -> System.out.println("old Rating"+ x ))
		               .map(x -> x == 'A' ? 'R': x)
		               .peek(x -> System.out.println("New Rating "+ x))
		               .forEach(System.out::println);
		
	}

}
