package app_4_48;

import java.util.stream.IntStream;

public class Test {

	public static void main(String[] args) {
		
		IntStream is = IntStream.of(3,2,1,5,3,4,5);
		
		System.out.println(   is.filter(x -> x > 3)
				                .distinct()
				                .average()           // as we are calling .average()  method on IntStream so  
				                .getAsDouble()       // .average() method return premitive version of  Optional 
				         );                          //  OptionaDouble and it has .getAsDouble() method
		
	}
}
