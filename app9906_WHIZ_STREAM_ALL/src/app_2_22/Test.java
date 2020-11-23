package app_2_22;

import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {

		Stream<String> s1 = Stream.of("1.0","1.2","1.6","1.4","1.3");
		
		DoubleStream  ds1  = s1.mapToDouble(x -> Double.valueOf(x))
				             .filter(d  -> d > 1.3);             // Double.valueOf()  method is same like
		                                                         // Double.parseDouble()        
		System.out.println(ds1.sum());                           //  both method take Sting as double "1.0"
		                                                         // and convert it into  1.0   premitive double
		                                                         // .mapToDouble() convert coming Stream into
		                                                         //   DoubleStream
		System.out.println("---------------------------");
		
		
        Stream<String> s2 = Stream.of("1.0","1.2","1.6","1.4","1.3");
		
		DoubleStream  ds2  = s2.mapToDouble(x -> Double.parseDouble(x))
				             .filter(d  -> d > 1.3);
		
		System.out.println(ds2.sum());
		
		
		
		// Note:   .sum() method is defined in DoubleStrem  so .mapToDouble() convert Stream into DoubleStream
		
		
		
		
		
		
		
		
	}

}
