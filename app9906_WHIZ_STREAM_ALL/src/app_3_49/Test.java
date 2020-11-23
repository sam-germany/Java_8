package app_3_49;

import java.util.function.Function;
import java.util.function.ToIntFunction;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {
	
	static class Provider{
		int rating;
		String name;
		
	    Provider(String n , int r){
	    	rating  = r;
	    	name = n;
	    }
	}

	public static void main(String[] args) {

		Stream<Provider> s = Stream.of(
				                      new Provider("A",7),
				                      new Provider("B",9),
				                      new Provider("C",6)
				                      );
		Function<Provider,Integer> toInt1 = p -> p.rating;
		
		Stream<Integer> x= s.map(toInt1);
		
	//	System.out.println(x.limit(1).map(1).get());
		
		
	}

}
