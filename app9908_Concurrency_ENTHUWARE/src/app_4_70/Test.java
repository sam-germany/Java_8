package app_4_70;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class Test {

	public static void main(String[] args) {

		ConcurrentMap<String, Object> cache = new ConcurrentHashMap<>();
		
		cache.putIfAbsent("a", new Test());   // this is better way
		
		
		
		
		
		
		if(!cache.containsKey("a")) {   // this is same code as above but this is simple way
			                               // but above  way is better
			cache.put("a", new Test());
		}
		
		
		
		
	}

}
