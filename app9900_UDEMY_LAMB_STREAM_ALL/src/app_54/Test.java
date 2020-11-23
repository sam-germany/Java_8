package app_54;

import java.util.Optional;

public class Test {

	public static void main(String[] args) {

		Optional<Integer> op = Optional.ofNullable(null);
		
		System.out.println(op.orElse(12346));
	
		
		// like this we can display and value if null is showing
		
	}

}
