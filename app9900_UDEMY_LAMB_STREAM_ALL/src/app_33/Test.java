package app_33;

import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
    	
        List<String> l = Arrays.asList("north", "east", "west", "south");
        
        l.replaceAll(s -> s.substring(0,1).toUpperCase().concat(s.substring(1)));
 
        System.out.println(l);
        
        
        
        
        
//        List.replaceAll(UnaryOperator<> );
  
    
    }
}