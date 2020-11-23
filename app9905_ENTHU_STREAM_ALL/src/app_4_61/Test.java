package app_4_61;

import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {

		Map<String, Integer> m  = new HashMap<>();
		
		m.put("a", 2);
		m.put("b", 2);
		m.put("c",1);
		
		m.put("a", null);  // hier it changes the value for       key = "a"         value = null
		
		m.merge("a", 3,(x,y) -> x+y);         
		m.merge("b", 2, (i1,i2) -> i1 + i2);
		m.merge("c", 5, (i1,i2) -> i1 + i2);
		
		m.merge("d", 6, (i1, i2) -> i1 + i2);   // as "d" key is not defined in Map  but if we put in .merge()
		                                        // then i add this key
		
		
	// 	m.merge("a", null ,(x,y) -> x+y);    // we can not add null key through .merge() method  
		System.out.println(m);
		
		
		System.out.println("----------------");

		Map<String, String> m2  = new HashMap<>();
		m2.put("a", "aaaa");
		m2.put("b", "bbbb");
	
	   m2.merge("a", "ffff", String::concat);
	   
	   System.out.println(m2);
		
	}

}
