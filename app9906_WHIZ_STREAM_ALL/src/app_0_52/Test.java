package app_0_52;

import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {

		Stream  s1 =  Stream.of("A","B","C");
		
		System.out.println(   s1.limit(1) 
				                .skip(1)
				                .findAny()
				          );
		
	}

}
