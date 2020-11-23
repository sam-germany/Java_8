package app_2_36;

import java.util.LinkedHashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
    	
        Map<Integer, String> map = new LinkedHashMap<>();
       
        map.put(2, "one");
        map.put(null, "zero");
        map.put(1, "one");
 
        System.out.println(map);
    }
}