package app_2_35;

import java.util.Map;
import java.util.TreeMap;

public class Test {

	public static void main(String[] args) {

		Map<Integer, String> m = new TreeMap<>();
       	m.put(2, "B");
    	m.put(1, "A");
    	
    	m.forEach((x,y)-> System.out.println(x+" "+y));
	}

}
//  extra point  as   all wrapper and String classes bydefault implements comparable
// so as we use TreeMap<>();   it return  DNSO  as output