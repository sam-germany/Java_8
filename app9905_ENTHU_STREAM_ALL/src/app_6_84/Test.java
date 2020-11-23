package app_6_84;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {

		List<String> l  = Arrays.asList("j", "a", "v","a");
		
		String word1 = l.stream()
				       .reduce("", (a,b)-> a.concat(b));
		
		System.out.println(word1);
		
		
		String word2 = l.stream()
				        .collect(Collectors.joining());
		
		System.out.println(word2);

		
		String word3 = l.stream()
				        .collect(Collectors.groupingBy(a -> a)) // hier it return Map<Object, List<String>>
				        .toString();                            // but if use .toString() then it call the
		                                                        // .toString() on the  Object fields as we do 
		System.out.println(word3);                             // always  in our codes and display all the
                                                               //  output as String type 

		String word4 = l.stream()
				        .collect(Collectors.groupingBy(a -> "")) 
				        .toString();
		
		System.out.println(word4);
	}

}
