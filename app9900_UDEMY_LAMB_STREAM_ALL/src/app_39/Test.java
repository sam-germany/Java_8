package app_39;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class Test {

	public static void main(String[] args) {

		List<Integer> l = Arrays.asList(2,3,4);
		
	//	UnaryOperator<Long> op = s -> s*s*s;
		
		UnaryOperator<Integer> op = s -> s*s*s;  // if we replace like this then it will work
		
		l.replaceAll(op);
		
		l.forEach(System.out::println);
				
}}

/*
    List.replaceAll( UnaryOperator );      it takes   UnaryOperator  as argument.
    
    read explanation easy to understand





*/