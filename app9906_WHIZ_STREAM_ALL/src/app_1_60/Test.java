package app_1_60;

import java.util.Optional;

public class Test {

	public static void main(String[] args) {

		
		Optional<Integer> op = Optional.of(8);
		
		op.filter( p -> p > 8)
		  .ifPresent(System.out::print); // this will not print anything means if a Optional obj is their then
	                                     // only  the   ifPresent()  will be executed
		
		op.filter( p -> p > 5)
		  .ifPresent(System.out::print); // this will print 8  as output
	
		
		
		
	}

}
