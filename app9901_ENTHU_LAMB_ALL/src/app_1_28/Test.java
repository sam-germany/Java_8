package app_1_28;

import java.util.Arrays;
import java.util.List;
import java.util.function.DoubleFunction;

public class Test {

	public static void main(String[] args) {

		List<Double> list = Arrays.asList(10.0 , 12.5, 10.5);
		
		DoubleFunction df = x -> x +10;
	// 	list.stream().forEach(df);   not alloweed
		
		
		
		list.stream().forEach(x -> System.out.println(x));  // this works ok
		
	}

}
