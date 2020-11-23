package app_4_68;

import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {

		Map<Integer, String> hm  = new HashMap<>();
        hm.put(2, "bb");
        hm.put(1, "aa");
        
        hm.forEach((key, value)-> System.out.println(key));  // like this we can only print key   
        hm.forEach((key, value)-> System.out.println(value));  // like this we can only print value 
        
    //  hm.forEach((key, value)-> System.out.println(key, value));    this will give us compilation error
        
        
        hm.forEach((key, value)-> System.out.printf("%d %s",key, value));
        
        
            //  syso.printf(    %s   --- String
            //                  %d   ---  decimal   or numbers we can say
            //                  %f   ---  float type
           //                   %t   ---  date/ time format
        
        
	}

}
