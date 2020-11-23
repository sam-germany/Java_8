package app_40;

import java.util.function.ToIntFunction;

public class Test {

	public static void main(String[] args) {

		String text1  = "A aA aB Ba aC Ca";
		
//		ToIntFunction<String> func = (x,y) ->  x.indexOf(y);        //  i tried but not able to convert this function into
  		                                                       //  into Lambda express it shows error.
		ToIntFunction<String> func = text1::indexOf;
		
		
		System.out.println(func.applyAsInt("a"));
	}}


//  ToIntFunction<String>      means   it takes a  <String>  and return a int value
