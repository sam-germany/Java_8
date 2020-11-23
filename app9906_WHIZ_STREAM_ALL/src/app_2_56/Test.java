package app_2_56;

import java.util.Optional;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {

		Stream<Integer> s =  Stream.of(10,20,30);
		
		Stream<Integer> out = s.skip(2)
				               .filter(x ->  x<20);

		Optional<Integer> op = out.findAny();
		
		
		if( op.isPresent()) {
			System.out.println(op.get());
		}else {
			System.out.println("Empty----");
		}
				
	}

}
// .findAny() return Optional