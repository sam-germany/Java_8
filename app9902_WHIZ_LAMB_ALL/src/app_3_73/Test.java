package app_3_73;

import java.util.function.DoublePredicate;
import java.util.stream.DoubleStream;

public class Test {

	public static void main(String[] args) {

		DoubleStream ds = DoubleStream.of(12.1, 12.2, 12.7, 12.5, 12.8);
	
		DoublePredicate dp = d -> d ==12.5;
	
	    DoublePredicate dps = dp.negate().and(d -> d > 12.5);
	    
	    ds.filter(dps).forEach(d -> System.out.println((int)d));

	    
	    System.out.println("-----------");
	    
	//    ds.filter(dps).forEach(d -> System.out.println(d));
	}

}
