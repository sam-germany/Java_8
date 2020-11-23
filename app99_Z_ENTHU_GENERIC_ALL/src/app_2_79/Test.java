package app_2_79;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		String[] names  = {"Alex", "Bob", "Charlie"};
		
		List<?> l1 = new ArrayList<>(Arrays.asList(names));
		
		System.out.println(l1.get(0));

		
		Object s = l1.get(0);  // compiler do not know the type of List<?>  so need Object type to get the element
		System.out.println(s);

		
	//    l1.add("bunny");   // as compile do not the List<?> type so we can not add anything
	
	
	}

}
