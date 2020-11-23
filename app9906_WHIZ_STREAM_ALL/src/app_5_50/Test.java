package app_5_50;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class Test {

	public static void main(String[] args) {

		DoubleStream ds = DoubleStream.of(2.5, 3.1 ,5.0);
		
		Map<Boolean, List<Double>>  map  =
				     ds.boxed().collect(Collectors.groupingBy( i -> i >=3.1));
	
	
		// we are not alloweed to call  .collect() method on premitive Stream.
		//   so in this case we are using .boxed()  method to change every
		// premitive double into Double wrapper and now we can call  .collect() method on it
	
	}

}
