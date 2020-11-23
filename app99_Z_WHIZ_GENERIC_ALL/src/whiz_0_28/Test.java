package whiz_0_28;

import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {

		Map m = new HashMap();

		m.put(8,"B");
		m.put(1, "A");
		m.put(3, 1);
		m.put(2, "B");		
		
		
		System.out.println(m);
		
		
		m.keySet().forEach(System.out::println);
		
		System.out.println("------------");
		
		m.values().forEach(System.out::println);
        	
		System.out.println("---------------");
		
		
	//	m.forEach(System.out::println);    this will not work in   Map
		
		
		m.forEach((x,y) ->  System.out.println(x));
		m.forEach((x,y) ->  System.out.println(y));
		
	}

}
