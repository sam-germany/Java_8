package app_2_63;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

 
public class Test {
    public static void main(String[] args) {
      
    	List<String> l = Arrays.asList("###","#","####","##");
    	
    	Comparator<String> c  = Comparator.comparing(x -> x);
    	
    	Collections.sort(l, c);
    	printCodes(l);
    	
    	
    	
    	System.out.println("------------------");
 
    	
    	
    	Collections.sort(l, c.reversed());
    	printCodes(l);

    
    
    	  System.out.println(l);
    	
    }
    
    
    private static void printCodes(List<String> l) {
    	for(String str: l) {
    		System.out.println(str);
    	}}}

// this code also shows that changes will be reflected back to original List