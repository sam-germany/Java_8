package app_0_61;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		List<Integer> l = new ArrayList<>();
		
		l.add(21);
		l.add(13);
		l.add(30);
		l.add(11);
		
	
		//	l.remove( e -> e%2 != 0);    .remove() method does not take predicate
		
		
		l.removeIf( e -> e%2 != 0);  // all the even nurmbers are deleted   odd =30  remain
		
		System.out.println(l);
		
		
	}

}
