package app_2_37;

import java.util.NavigableMap;
import java.util.TreeMap;

public class Test {
    public static void main(String[] args) {
    	
    	
        NavigableMap<Integer, String> map = new TreeMap<>();       // TreeMap<>   by-default do  DNSO  
        map.put(25, "Pune");
        map.put(32, "Mumbai");
        map.put(11, "Sri Nagar");
        map.put(39, "Chennai");
 
        System.out.println(map);                    // {11=Sri Nagar, 25=Pune, 32=Mumbai, 39=Chennai}
        
        System.out.println(map.headMap(25));  // {11=Sri Nagar}
        
        System.out.println(map.headMap(25, true));  // {11=Sri Nagar, 25=Pune}
        
        System.out.println(map.headMap(25, false));  // {11=Sri Nagar}
    
        System.out.println(map.tailMap(25));     //{25=Pune, 32=Mumbai, 39=Chennai}
        
        System.out.println(map.firstEntry()); //11=Sri Nagar
    
        System.out.println(map.lastEntry()); //39=Chennai
    
        System.out.println(map.descendingMap()); //{39=Chennai, 32=Mumbai, 25=Pune, 11=Sri Nagar}
    
        System.out.println(map.floorKey(30)); //25       means return same key or less then given value
    
        System.out.println(map.ceilingKey(30)); //32     means return same or hiegher then the given value
    
    
    
    }
}