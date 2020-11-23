package app_6_15;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Test {

	public static void main(String[] args) {

	     IntStream i2 = IntStream.range(1, 4);
		 OptionalInt sum2 = i2.reduce((a, b) -> a+b);  // if we do not provide base value on IntStream  .reduce()
		 System.out.println(sum2.orElse(1));          // method then it reutrn OptionalInt , as it return OptioanlInt
                                                      // so we can call .orElse() method on it
		 
		 System.out.println("----------------------");
		 
		 
		 IntStream i3 = IntStream.range(1, 4);
		 int sum3 = i3.reduce(2, (a, b) -> a+b);  // as we are providing base value on IntStream  .reduce()
		 System.out.println(sum3);                // then it reutrn int value , so we can not use .orElse() 
		                                         // method on the return value
		 
		 System.out.println("----------------");
		
		IntStream i1 = IntStream.rangeClosed(1, 4);
		OptionalInt sum = i1.reduce((a,b) -> a+b);    // same will be applie on IntStream .rangeClosed() method
		System.out.println(sum.orElse(2));           // 
		

		
		
	
				
	}

}
