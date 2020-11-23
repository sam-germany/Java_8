package app_0_54;

import java.util.Optional;
import java.util.OptionalInt;

public class Test {

	public static void main(String[] args) {

	/*		
		Optional<String> x1  = Optional.of("1");
		
		OptionalInt op1 = x1.map(Integer::parseInt);  // map() method of Optional class return
		System.out.println(op1);                      //  Generic Optional but not premitive type
	*/	                                              // of Optional, this is reason this gives error
		
		
		
		
		Optional<String> x2 = Optional.of("1");
		
		Optional<Integer> op2 = x2.map(Integer::parseInt);
		System.out.println(op2);
  
	}

}
