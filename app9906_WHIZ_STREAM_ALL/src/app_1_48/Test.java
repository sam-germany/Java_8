package app_1_48;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {

		IntStream i1 =  IntStream.of(10,20,30);
		
		i1.peek( x -> System.out.println( x*2 +" "))
		  .count();
		
		
		
		
        Stream<Integer> i2 =  Stream.of(10,20,30);   
		
		i2.peek( x -> System.out.println( x*2 +" "))
		  .count();
		
		
		// .count()  method we can call on both  simple Stream and premitive  IntStream
		
		
	}

}
