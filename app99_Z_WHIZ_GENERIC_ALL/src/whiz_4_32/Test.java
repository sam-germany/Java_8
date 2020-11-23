package whiz_4_32;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Test {

	public static void main(String[] args) {


	Map<String, Integer> m = new TreeMap<>();  // it s a sorted Map, it sorts on the basis of keys.
	m.put("ab", 1);
	m.put("qbc", 2);
	m.put("abcd", 3);
	
	System.out.println(m.values());
	
	//  m.replaceAll((k,v) ->   5 );     
	
	
	m.replaceAll((k,v) ->  (int)k.charAt(v));   // the main point is we can not change keys
	System.out.println(m.values());             // but we can change values
	
	System.out.println(m);
	
	}

}
