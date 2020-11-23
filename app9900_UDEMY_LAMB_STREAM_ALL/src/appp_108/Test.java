package appp_108;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Test {

	public static void main(String[] args) {

		
	//	UnaryOperator<Character> op = c -> (char) (c.charValue() + 1);      // both will work fine
		
		Function<Character, Character> op = x ->(char)( x + 1);               // both will work fine
		 
		List<Character> l1 = Arrays.asList('A','E','I','O','U');
		
		l1.stream().map(x ->   op.apply(x))
		           .forEach(System.out::println);

	
      // just for understanding
		
	//	char s = 'a';        charValue()  method i defined in wrapper type so we need to use Character s = 'a';		
		
		Character s = 'a';
	
		System.out.println(s.charValue()); // it reurn    a 
	   
		System.out.println(s.charValue()+1);  // as we add  1  then it return the ASCII value of a  = 98
	   
		
		System.out.println((char) s.charValue()+1 );  // 98  if we want to convert from ASCII to char  then we have 
		                                              // to typecast it but both with brackets otherwise it will 
		                                              //not work
		
		System.out.println((char) ( s.charValue()+ 1) );  // now it return  b   
		
	}

}
