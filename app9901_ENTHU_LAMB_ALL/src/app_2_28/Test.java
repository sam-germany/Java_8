package app_2_28;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.DoubleFunction;

public class Test {


	public static void main(String[] args) {


		List<Double> dList = Arrays.asList(10.0, 12.0); 
		
		DoubleFunction df = x ->  x+10;
		

		dList.stream().forEach(System.out::println); // this works
	
//     dList.stream().forEach(df);     compilation error  

//	 .forEach(Consumer); it takes (consumer)  as argument  but hier we are trying to pass( Function) 
	
}}