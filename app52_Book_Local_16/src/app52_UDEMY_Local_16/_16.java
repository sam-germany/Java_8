package app52_UDEMY_Local_16;

import java.util.Map;
import java.util.Properties;
import java.util.TreeMap;

public class _16 {

	public static void main(String[] args) {

		Map<String, String> map = new TreeMap<>();
		map.put("tool", "hammer");
		map.put("problem","nail");
		
    	Properties props = new Properties();
	    map.forEach((k,v) -> props.put(k, v));
	    
	    Object t = props.get("tool");
	  
	    String p = (String) props.get("problem");
	    
	    System.out.println(t);
	    System.out.println(p);
		
		
		
	}

}
