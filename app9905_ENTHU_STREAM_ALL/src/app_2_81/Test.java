package app_2_81;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {

		AtomicInteger ai = new AtomicInteger();
		Stream<Integer> s = Stream.of(11,11,22,33).parallel();
		
		s.filter(e ->{
             	//		ai.incrementAndGet();
		               	return e % 2 == 0;
		              }).forEach(System.out::println);
		
		
	}

}
