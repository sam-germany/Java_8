package app_3_53;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {        // if we take IntStream then   .findFirst() method
                                                    //  return   OptionalInt     so we use in the 
		IntStream s = IntStream.of(2,4,6,34,5,9);   // begining   premitive type and we get also premitive type
		                                            // if we use Optionl Generic Optioanl>Integer> 
		OptionalInt op = s.filter(x -> x < 0)       //  type then we will get  error
				          .findFirst();
		
		if(op.isPresent()) {
			System.out.println(op.getAsInt());
		}else {
			System.out.println("Empty");
		}
	
		System.out.println("--------------------------");
		
		
           Stream<Integer> s2 =  Stream.of(2,4,6,34,5,9); // hier we use  Generic Stream   Stream<Integer> 
		                                                  // so we will also get the Generic Optional
		Optional<Integer> op2 = s2.filter(x -> x < 0)     //   Optional<Integer>
				          .findFirst();
		
		if(op2.isPresent()) {
			System.out.println(op2.get());
		}else {
			System.out.println("Empty");
		}
	}

}
