package whiz_5_22;

import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {

		Map<Integer,Double> m = new HashMap<>();
		m.put(2, 2.5);
		m.put(1, 1.5);
		m.put(3, 3.5);
	    
	    m.keySet().forEach(System.out::println);
	    
	    System.out.println("-----------");
	    
	    m.values().forEach(System.out::println);
	
	}

}
