package app_42;

import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {

		Stream<StringBuilder> s = Stream.of();
		
		s.map(x -> x.reverse()).forEach(System.out::println);
	
		
		// case 2
     //  Stream<StringBuilder> s = Stream.of("a");    //   as    "a"  it is a Stream<String> type, but we are trying to 
		                                             // take it as Stream<StringBuilder> type so we can not convert
		                                             //  Stream<String>   into  Stream<StringBuilder>
		s.map(x -> x.reverse()).forEach(System.out::println);
		
		
		
	// case 3
       Stream<String> s2 = Stream.of("a","b","c");
//		s2.map(x -> x.reverse()).forEach(System.out::println);    in this case we make Stream<String>   so this is ok
		                                                       // but  .reverse()  method is defined in StringBuilder class
		                                                       // in String their is not reverse() method so it give us
	}                                                          // error

}
