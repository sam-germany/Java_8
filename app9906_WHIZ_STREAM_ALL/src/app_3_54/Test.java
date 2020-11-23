package app_3_54;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {

                                                    // as we use Stream<Integer>  Generic Stream so we createed a Generic
		Stream<Integer>  s1 = Stream.of(2,4,6,8);      // enviornment so  .finAny() method also return  Generic Optional
		
		Optional<Integer>  op1  = s1.peek(System.out::println)
				            .findAny();
		System.out.println(op1.get());
		
		
		
		System.out.println("-------------------------");
		
		
		
		
		IntStream  s = IntStream.of(2,4,6,8);              // hier we start with  Premitive Stream then   .findAny()
		                                                  // method return also premitive int    OptionalInt
		OptionalInt  op  = s.peek(System.out::println)
				            .findAny();
		System.out.println(op.getAsInt());
		
		
	}

}
