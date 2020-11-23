package whiz_4_25;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		List lis = new ArrayList<>();
		
		lis.add(5);
		lis.add(6);
		lis.add(7);
		
	// 	lis.removeAll(s -> s > 5); this will not work because removeAll() does not take
		                         // take single value
		lis.removeAll(lis);      // it take whole   ( Collection)  so this will work
		
		
//	  lis.removeIf(predicate);	  this method take Predicate as argument.

	  
	  System.out.println(lis);
		
	}

}
