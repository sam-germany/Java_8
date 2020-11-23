package app_4_59;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Test2 {

	public static void main(String[] args) {

		String s1 = "carpe deim. seize the day, body. Make your lives extraordinary.";
		String s2 = "Frankly, my dear, i dono´t give a damn!";
		String s3 = "Do i look like i give a damn?";
		
		List<String> sentences = Arrays.asList(s1,s2,s3);
		
		Stream<String> st1 = sentences.stream()
				                              .flatMap(str -> Stream.of(str.split("[ ,.´!?\r\n]")))
				                              .filter(s -> s.length() > 0)
				                              .distinct();
		st1.forEach(System.out::print);

		
	
		
		System.out.println("------------------");
		
		Stream<String> st2 = sentences.stream()
                                      .flatMap(str -> Stream.of(str))  // this will print all the 3 string 
                                      .filter(s -> s.length() > 0)     // together
                                      .distinct();

		  st2.forEach(System.out::print);
		
	}

}
