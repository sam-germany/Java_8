package app_5_49;

import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {

		Stream<String> st = Stream.of("1","2","3","4");
		
		Stream ints = st.map(x -> Integer.decode(x));
		
	
		
   //   Stream  ints2 = st.map(Integer::decode);
		
		ints.forEach(System.out::println);
		
	}

}

//  Integer.decode();   this method take a String and convert it into  Integer wrapper type
