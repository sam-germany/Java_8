package app_5_63;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {

		Stream<Integer> st1 = Stream.of(2,5,6,8);
		
		Predicate<Integer> lp = (x) -> x > 5;
		
		Consumer<Integer> lc  = (a) -> {
			                           if(lp.negate().test(a)) {
			                        	         System.out.print(a);
			                                                   }
		                               };
		                               
		st1.forEach(lc);
	}

}
