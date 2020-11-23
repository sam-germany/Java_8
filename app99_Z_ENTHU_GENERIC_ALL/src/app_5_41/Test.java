package app_5_41;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		String [] names = new String[] { "bb23", "BB23", "23bB", "b23B", "bB23", "B23b", "23Bb"};
		
		List<String> l = Arrays.asList(names);
		
		Collections.sort(l);
		
		System.out.println(l);
		
	// as String class by-default implements Comparable, so DNSO hier not only the first character it compare
	// it compare all the character of one String with the another String
		
	//     spaces < numbers < uppercase < lowercase
	
	}

}
