package app_68;

import java.util.Arrays;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {

		Stream<Integer> s = Arrays.asList(1,2,3,4,5).stream();
		
		System.out.println(s.mapToInt(i ->i ).average().getAsDouble());
	}

}
