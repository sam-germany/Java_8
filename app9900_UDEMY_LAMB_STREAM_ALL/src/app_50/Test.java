package app_50;

import java.util.Optional;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {

		Optional<Integer> op = Stream.of(10).findAny();

		System.out.println(op);    // it return object inside toString() defined in Optional that is  Optiona[]
	 
		System.out.println(op.get());  // it return only object
		
	}

}
