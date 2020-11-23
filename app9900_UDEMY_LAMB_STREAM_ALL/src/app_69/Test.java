package app_69;

import java.util.stream.IntStream;

public class Test {

	public static void main(String[] args) {

		IntStream s = IntStream.rangeClosed(1, 20).filter(i -> i% 2 == 0);
		
		System.out.println(s.summaryStatistics());
	}

}
