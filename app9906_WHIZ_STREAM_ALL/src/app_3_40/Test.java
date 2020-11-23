package app_3_40;

import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {

		Stream<String> s1 = Stream.of("2","3","4");
		
		System.out.println(s1.reduce("1",  String::concat, String::concat));
	
   
		 
		Stream<String> s2 = Stream.of("2","3","4");
		
		System.out.println(s2.reduce("1",  (x,y) -> x.concat(y), (a,b) -> a.concat(b)));
	
	// in copy  i explained how it works
	}

}
