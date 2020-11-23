package app_6_36;

import java.util.stream.IntStream;

public class Test {

	public static void main(String[] args) {

		
		IntStream s = IntStream.rangeClosed(1, 5);
		
		System.out.println(s.parallel()
				            .reduce(      (x, y) -> x+y )    );
		
		
		
		
		
		
        IntStream s2 = IntStream.rangeClosed(1, 5);
		
		System.out.println(s2.parallel()
				            .reduce(      (x, y) -> x+y ).getAsInt()    );
		
	}

}
