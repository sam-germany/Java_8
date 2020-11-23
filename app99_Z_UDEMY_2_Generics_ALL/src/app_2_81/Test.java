package app_2_81;

import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		List<String> l = Arrays.asList("7 Seven", "Lucky 7", "77");
		
		l.stream().filter(x -> x.contains("7"))
		          .forEach(System.out::println);
		
	}

}
