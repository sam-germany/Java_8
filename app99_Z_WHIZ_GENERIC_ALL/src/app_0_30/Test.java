package app_0_30;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		List<? extends Number> l = new ArrayList<>();
		
		 // l.add(new Integer(10));   as per explanation this will not compile
		
		
		System.out.println(l.get(0)+"  "+l.get(1));  // as this will work, read explanation carefully
		
		
	}

}
