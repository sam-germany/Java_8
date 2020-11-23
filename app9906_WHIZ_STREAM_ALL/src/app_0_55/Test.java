package app_0_55;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {

		Stream<String> l = Stream.of("BB","CCC","AB","CCC","BB");
		
		    Set s = l.collect(Collectors.toSet());
		
		     System.out.println(s);
	}

}
