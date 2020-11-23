package whiz_2_26;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Test {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();
		
		list.add("One");
		list.add("Ones");
		list.add("Once");
		list.add("On");
		
		
		Predicate<String> p1 = x -> x.startsWith("O");
		
		Predicate<String> p2 =  p1.and( x -> x.endsWith("e"));
		
		
		list.removeIf(p2);
		
		System.out.println(list);
		
		
	}

}
