package app_91;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		List<String> l = new ArrayList<>(Arrays.asList("Z","Y","X"));
		
	System.out.println( 	l.stream().sorted().findFirst().get()   );
		
		System.out.println(l.get(2));
		
	}

}
