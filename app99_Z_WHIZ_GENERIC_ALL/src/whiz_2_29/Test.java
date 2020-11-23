package whiz_2_29;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		List<String> l = new ArrayList<>();
		
		l.add("B");
		l.add("C");
		l.add("A");
		l.add("D");
		
		l.replaceAll(x -> x.toLowerCase());
		
		l.forEach(System.out::println);
		
	}

}
