package app_0_48;

import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {

		Stream<String>  s = Stream.of("abc","ab");
		
		System.out.println(  
				           s.max((x,y) -> Integer.compare(y.length() , x.length())).get()
				           
				          ); // output   "ab"  as you need desecending order and use .get() method
		
		
		
		  System.out.println(  
		           s.max((x,y) -> Integer.compare(y.length() , x.length()))
		           
		          );  // output    Optional[ab]   as you need desecending order
	}

}
