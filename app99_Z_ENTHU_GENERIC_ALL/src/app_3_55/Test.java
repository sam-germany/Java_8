package app_3_55;

import java.util.NavigableMap;
import java.util.TreeMap;

public class Test {

	public static void main(String[] args) {

		NavigableMap<String,String> m1 = new TreeMap<>(); // as we are using TreeMap<> so  DNSO will be done  by-default
		m1.put("c", "cat");                               //  we have not to add any comparator/comparable
        m1.put("e", "dog");
        m1.put("a", "apple");
		m1.put("b", "boy");        //  NavigableMap<> extends SortedMap so it first sort all the 
                                                      /// keys then apply other operations
        
	    System.out.println(m1);      // output as DNSO
		
	    
		System.out.println(m1.floorKey("1"));    //return only  key--- equal-to   or less then given key or  if not
    //                                                                      key and  heiger key is found then return null
		
		System.out.println(m1.ceilingKey("c"));  // return only key--  equal-to   or heigher or  if not key and 
                                                 //                              heiger key is found then return null
        
		
        System.out.println(m1.size());
        System.out.println(m1.pollLastEntry());    // delete and return the last entry  (both key-value)
        System.out.println(m1.pollFirstEntry());    // delete and return the first entry   (both key-value)
        System.out.println(m1.size()); 
     
        System.out.println(m1);
        
        
        NavigableMap<String, String> m2 = m1.tailMap("b", true);  // return a new map  start and 
                                                                    //           inclusive "b" key till last entry
        System.out.println(m1.size());
        System.out.println(m2.size());
		
        System.out.println(m2);
		
	}}
/*  till now i know that only Queue has these methods  .poll() and other
    but NavigableMap<>  has also these methods. just remember them
    
 


*/