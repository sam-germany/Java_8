package app_3_73;

import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		List<Integer> ls = Arrays.asList(1,2,3);
		
		ls.stream().forEach(System.out::println);
		
		System.out.println("-----------");
		
		ls.stream().map(a -> a * 2).forEach(System.out::println);
		
	}

}
