package app_2_08;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class Test {

	public static void main(String[] args) {

		IntStream is1 = IntStream.rangeClosed(0, 5);
	  
		OptionalDouble x = is1.average();
		
		System.out.println(x);
	
	}

}
