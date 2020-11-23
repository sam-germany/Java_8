package app_07ba_HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

public class Test {
	public static void main(String[] args) {

		Country c1 = new Country("India",10);
		Country c2 = new Country("Japan",10);
     	Country c3 = new Country("france",10);
		Country c4 = new Country("Russia",10);
	
	
		HashMap<Country, String> hashMap1 = new HashMap<>();
		hashMap1.put(c1, "Delhi");
		hashMap1.put(c2, "Tokyo");
		hashMap1.put(c3, "Paris");
		hashMap1.put(c4, "Moscow");
		
		
		TreeMap<Country, String> tm = new TreeMap<>(hashMap1);
		
		Iterator it =  tm.keySet().iterator();
		
		while(it.hasNext()) {
			Country c = it.next();
			
		}
		
		
	
	
	
	
	
	
	
	
	
	}

}
