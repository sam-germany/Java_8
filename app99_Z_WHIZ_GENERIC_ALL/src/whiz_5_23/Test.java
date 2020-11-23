package whiz_5_23;

import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {

		Map<Integer,Integer> m1 = new HashMap<>();
		m1.put(2, 8);
		m1.put(3, 6);
		m1.put(1, 7);
		m1.put(4, 5);
		
		System.out.println(m1);
		
		m1.computeIfPresent(3, (k,v)-> null);   // making a key/value = null  means removing it
		
		System.out.println(m1);
		
		m1.values().forEach(System.out::println);
		System.out.println("------------");
	
		Map<Integer,Integer> m2 = new HashMap<>();
		m2.put(1, 7);
		m2.put(2, 8);
		m2.put(3, 6);
		m2.put(4, 5);
		
		m2.computeIfAbsent(5,k -> 10);
		
		System.out.println(m2);
		
		m2.values().forEach(System.out::println);
	}

}
