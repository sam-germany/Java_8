package app_6_47;

import java.util.HashMap;
import java.util.List;

public class Test {
	
//                                 new HashMap< ? , List<String>>();    on right handside ?  whildcard is not alloweed 
	HashMap<?, List<String>> box = new HashMap<String, List<String>>();
	

	
	
	public void m1() {
		
		for(List<String> l: box.values()) {
			System.out.println(l);
		}
	}
	
	public static void main(String[] args) {

		
	}

}
