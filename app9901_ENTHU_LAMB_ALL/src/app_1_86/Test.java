package app_1_86;

import java.util.stream.DoubleStream;

public class Test {

	public static void main(String[] args) {

		DoubleStream  s = DoubleStream.of(0,2,4);
		
		double sum = s.filter(i -> i%2 != 0).sum();
		
		System.out.println(sum);
	}

}
