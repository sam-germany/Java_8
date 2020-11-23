package app_5_61;

import java.util.function.IntConsumer;
import java.util.stream.IntStream;

public class Test {

	public static void main(String[] args) {

	
		IntConsumer con = System.out::print;
		
		IntStream ins = IntStream.of(1,3,2,4,3).distinct();
		
		ins.forEach(con);
		
	}
}
// as we are using IntStream  so we must use IntConsumer in above case if we use 
//  Consumer con =      then we will get error