package app_5_55;

import java.util.Optional;

public class Test {

	public static void main(String[] args) {

		Optional<String>  op = Optional.of("10");
		
		Optional<Integer> oi = op.map(s -> Integer.decode(s));
		
		System.out.println(oi);
		
	}

}


//  Integer.decode()   method of Integer class take a  Optional<String> and convert it into    
//                                                                      Optional<Integer>