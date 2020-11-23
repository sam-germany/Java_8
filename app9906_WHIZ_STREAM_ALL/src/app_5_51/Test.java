package app_5_51;

import java.util.stream.IntStream;

public class Test {

	public static void main(String[] args) {

		IntStream in =  IntStream.of(3,8,4,1,0,7,2).sorted();
		
		System.out.println(in.limit(2).findAny());
	  
	//	 in.forEach(System.out::print);
	}

}
