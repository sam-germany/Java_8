package app_25;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class Test {

	public static void main(String[] args) {

		Map<Integer, Integer> m = new LinkedHashMap<>();
		m.put(1, 10);
		m.put(2, 11);                                       // till hier we are putting values in Map
		                                                    
		                                                 // from hier we are retriving the values
		
		BiConsumer<Integer, Integer> bc =(k,v) ->{
			                                    System.out.println(k +"  "+v);
                  		                           };
		
 /*        BiFunction<Integer, Integer, Integer> bf = (k,v) ->{
        	                                        System.out.println(k+"  "+v);
                                                     return null;                                       
                                                        };	                           
	
*/                                                            // Function will not be used	
	     m.forEach(bc);   // we can print like this 
                             
	     System.out.println(m);  // we can print like this  also
	}

}
