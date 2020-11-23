package app_4_52;

import java.util.Optional;

public class Test {

	public static void main(String[] args) {

		Optional<Integer> ops  = Optional.of( new Integer(20));
		
		ops.filter(x -> Integer.compare(22, x)> 0)   // it return  +1      so 
		   .ifPresent(System.out::print);
		
		
		
	}

}
