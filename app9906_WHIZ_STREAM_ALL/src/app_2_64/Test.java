package app_2_64;

import java.util.function.LongFunction;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {

		LongStream ls  = LongStream.of(1,2,3,4);
	
		LongFunction lnf = l -> (int)l;
		
		Stream ins = ls.mapToObj(lnf);
	}

}
