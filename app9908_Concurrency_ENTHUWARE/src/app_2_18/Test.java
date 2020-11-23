package app_2_18;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {

		AtomicInteger ai = new AtomicInteger();
		
		Stream<String> s =  Stream.of("old", "king", "cole","was", "a").parallel();
		
		s.filter( e->{
		               ai.incrementAndGet();
		               return e.contains("o");
	         	  }).allMatch( x -> x.indexOf("o") > 0);
		
		System.out.println(ai);
		
	}

}
// read the explanation then only this can drwa in mind.