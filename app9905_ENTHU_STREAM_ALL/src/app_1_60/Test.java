package app_1_60;

import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {

		Stream<String> names = Stream.of("sarah Adams", "Suzy Pinnell", "Paul Basgall");
		
		Stream<String> firstNames = names.map(e -> e.split(" ")[0]);// hier map() method first split one String
		firstNames.forEach(System.out::println);         // "sarah Adams"  into 2 String and return the  
	 	                                                 // [0] array index value we passed so as  0 passed
		                                                 // so  first value is return
		System.out.println("------------");
		
		
		
         Stream<String> lastName = names.map(e -> e.split(" ")[1]);
		  lastName.forEach(System.out::println);
	}

}
