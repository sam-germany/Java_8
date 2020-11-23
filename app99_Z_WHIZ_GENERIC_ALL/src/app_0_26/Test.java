package app_0_26;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		List<String> l = new ArrayList<>();
		
		l.add("and");
		l.add("an");
		l.add("animal");
		l.add("Ant");
		
		l.removeIf(s -> s.startsWith("an"));
		
		System.out.println(l);
		
		
		
		// the elements removed by  .removeIf( Predicate ) method will be reflected back to List
	}

}
