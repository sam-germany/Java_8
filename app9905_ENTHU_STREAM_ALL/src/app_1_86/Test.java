package app_1_86;

import java.util.stream.DoubleStream;

public class Test {

	public static void main(String[] args) {

		DoubleStream is = DoubleStream.of(0,2,4);
	
		double sum = is.filter(i -> i% 2 != 0).sum();
		System.out.println(sum);

		
		DoubleStream is2 = DoubleStream.of(0,2,4);
	
		double sum2 = is2.filter(i -> i% 2 == 0).sum();
		System.out.println(sum2);
		
		
	}

}
