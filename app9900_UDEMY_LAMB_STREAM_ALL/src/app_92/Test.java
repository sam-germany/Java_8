package app_92;

import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {

		Map<Integer, String> m = new HashMap<>();
		
		m.put(1, "a");
		m.put(2, "b");
		m.put(3, "c");
		
	  // m.stream()...   this will give us error, as we can not call stream() directly on map ,
	//	                   we cann call it on 2 ways
		
		// case 1
		m.entrySet().stream().forEach( x-> System.out.println(x.getKey()+"  "+x.getValue()));
		
		
		// case 2
		m.keySet().stream().forEach(x -> System.out.println(x));   //  it will return only keys
		
	}

}
