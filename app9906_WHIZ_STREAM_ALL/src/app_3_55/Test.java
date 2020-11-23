package app_3_55;

import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class Test {

	public static void main(String[] args) {

		IntStream s = IntStream.of(2,4,6,1,34,5,9);
		
		DoublePredicate pre = d -> d > 1;
		
		System.out.println(   s.asDoubleStream()           // hier we convert IntStream into DoubleStream so premitive type
				               .peek(System.out::println)  // as it is of premitive double so  the predicate we use it  
				               .anyMatch(pre)              // must also be of premitive double type otherwise we will get
				          );                               // get error, this is reason we use  DoublePredicate

		
		System.out.println("---------------------------");
	
		
		
        IntStream s1 = IntStream.of(2,4,6,1,34,5,9);
		
		IntPredicate pre1 = d -> d > 1;           
		
		System.out.println(  s1.peek(System.out::println)
				               .anyMatch(pre1)             // hier we are not converting the   IntStream into DoubleStream
				                                           // so hier we are using IntPredicate
				          );
		
	}

}
