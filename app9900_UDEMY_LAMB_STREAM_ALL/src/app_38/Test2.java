package app_38;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

interface StringConsumer2 extends Consumer<String>{

                                 	                 
/*	@Override                                      
	default void accept(String t) {                
     System.out.println(t.toUpperCase());		     
	}
*/
	
	@Override
	abstract void accept(String t);       //now we @Override the    Consumer Interface     abstract  accept()  method 
	                                      // now StringConsumer2  interface become   a Functional interface
	
}	
	
public class Test2 {
	public static void main(String[] args) { 
		                                                                // as StringConsumer2 is a Functional interface
		StringConsumer2 con = s -> System.out.println(s.toLowerCase());  // now we can use Lambda expression on it  
		                                                                
		List<String> l = Arrays.asList("Dr","Mr","Miss","Mrs");
		l.forEach(con);

	
	}

}