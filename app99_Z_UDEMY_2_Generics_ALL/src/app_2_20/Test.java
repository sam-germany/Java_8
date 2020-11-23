package app_2_20;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		List<String> list1  = new ArrayList<>();
		list1.add("A");
		list1.add("B");
		
		List <? extends Object> list2 = list1;
		 list2.remove("A"); //Line 13                 // as .remove() is a non generic method so no issue with it
		 list2.get(0);                       // .get(index)   is alloweed
	//   list2.add("C"); //Line 14
	
	
		 System.out.println(list1);
	}

}

// Read complete explantion very imp

//Simple way to remember is that as upper-bounded wildcard is used, hence add operation is not supported.
//Line 14 causes compilation failure.
