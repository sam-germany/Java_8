package appp_107;

import java.util.function.LongFunction;
import java.util.function.LongUnaryOperator;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {

		long seed = 10;
		
		Stream<Long> s = Stream.iterate(seed, i -> i + 2).limit(2);
		
//   	s.forEach(System.out::println); // it prints   10  12    just for understanding i print it hier
	
	                                   //      2 -> 10 ->  10 / 2    
		LongFunction<LongUnaryOperator> func = m ->  n ->   n / m ;
		
		// note:   func m -> n   till hier it acts in LongFuncation
		//  n / m          hier it acts in LongUnaryOperator
		
		s.mapToLong(i -> i).map(func.apply(2))
		                   .forEach(System.out::println);
	
	}

}
