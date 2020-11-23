package app_41;

import java.util.function.BiFunction;

public class Test {

	public static void main(String[] args) {

		BiFunction<Integer, Integer, Character> bf =(x,y) -> x + y;
		
		System.out.println(bf.apply(0, 65));
	
		
		//(1)  i tried all but we can not explicitly change the return type in this case from Int to Char
	
		// read explanation  easy to understand the point
		
	}

}
