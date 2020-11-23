package app_0_22;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {

		IntStream ds = IntStream.of(1,2,2,4);
		
	//	Stream<String> st = ds.boxed().map(Integer::toString);
		
	//	System.out.println(st.distinct().findFirst());
		
	
		
	// above will not work, but if we want to use like this with String then it work.	
		
	        Stream<String> ds2 = Stream.of("c","b","a");
		
			Stream<String> st2 = ds2.map(String::toString);
			
			System.out.println(st2.distinct().findFirst());
	
	
	
	
	
	
	}

}
