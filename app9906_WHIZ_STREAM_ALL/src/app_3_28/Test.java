package app_3_28;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {

		Map<String, String>  m = new HashMap<>();
		
		m.put("1", "A");
		m.put("2", "B");
		m.put("3", "C");
		m.put("4", "D");
 
		m.forEach( (k,v) -> m.replace(k, "D","A") );
		
	                   	 m.values()
	                   	 .stream()
	                   	 .collect(Collectors.toSet())
	                   	 .forEach(System.out::println);
		
	
// in .forEach() method compiler search  for key with value  "D"  and replace the value from "D" to "A"
//    so now we have	("1","A") and ("4","A")  so both have same value  and we have 
// created a Stream of values()   and after that we convert Stream to Set(); so the duplicates values will
//    be removed so   A B C   will be printed	                   	 
	                   	 
		
		
		
		
		
	}

}
