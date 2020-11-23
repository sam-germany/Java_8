package app_4_47;

import java.util.OptionalDouble;
import java.util.stream.LongStream;

public class Test {

	public static void main(String[] args) {

		LongStream   lo = LongStream.of(12, 10, 64, -12);    // as we use premitive version of Stream
		                       
		OptionalDouble od = lo.average();                     // then the .average() method of LongStream also return
		                                                     // premitive version of Optional as OptionalDouble
		System.out.println(od.getAsDouble());
		
	}

}
