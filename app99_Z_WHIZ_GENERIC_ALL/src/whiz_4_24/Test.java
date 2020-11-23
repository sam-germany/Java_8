package whiz_4_24;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		List<Integer> l = new ArrayList<>();
		
		l.add(1);
		l.add(2);
		l.add(3);
		
		l.replaceAll(x -> x/2);
		
		System.out.println(l);
		
		
		System.out.println(l.stream().distinct().count());
		
		
	}

}
