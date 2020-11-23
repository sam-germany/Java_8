package app_0_64;

import java.util.function.IntConsumer;
import java.util.stream.IntStream;

public class Test {

	public static void main(String[] args) {

		IntStream  ins = IntStream.rangeClosed(1, 5);
		
		IntConsumer con = System.out::print;
		
		con.accept(ins.sum());
	}

}
// just think in mind  their is a paint box , what we are putting inside this box it is going to print