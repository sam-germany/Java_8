package app_2_77;

import java.util.stream.IntStream;

public class Test {

	public static void main(String[] args) {

		IntStream s = "OCP".chars();
		
		s.forEach(x -> System.out.println( (char)x ));
	
//        System.out.println(s.count());	
	
	
	}

}
