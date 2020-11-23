package app_03;

import java.util.function.Supplier;

public class Test {

	public static void main(String[] args) {

		Supplier<StringBuilder> sb = ()-> new StringBuilder(" olklH").reverse()
				                                                     .append("xx")
				                                                     .reverse();
		
		System.out.println(sb.get());
		
	}

}
