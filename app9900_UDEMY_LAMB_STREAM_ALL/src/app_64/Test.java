package app_64;

import java.util.Random;
import java.util.stream.IntStream;

public class Test {

	public static void main(String[] args) {

		IntStream s = new Random().ints(1,7).limit(2);
		
		System.out.println(s.max().getAsInt());
	}

}
