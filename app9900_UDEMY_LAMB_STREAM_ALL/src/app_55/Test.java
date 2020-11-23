package app_55;

import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {

		Stream<String> s1 = Stream.of("and","Or","not","Equals","binary");
		
		Optional<String> op = s1.filter(((Predicate<String>)Test::isChecking).negate())
				                .findFirst();
		
		System.out.println(op.get());
	}
	
	private static  boolean isChecking(String s) {
		
		s = s.substring(0,1).toUpperCase();
		
		switch(s) {
		case "A":
		case "E":
		case "I":
		case "O":
		case "U":
			
			return true;
		}
		return false;
		
	}

}
