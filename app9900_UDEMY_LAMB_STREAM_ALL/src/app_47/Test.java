package app_47;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		int ref = 10;
		
		List<Integer> l = new ArrayList<>();
		
		l.stream().anyMatch(i -> {                // hier as Stream() is empty so anyMatch() return false, but we are       
			                 System.out.println("Hello");    // printing it anywhere so no output in this case
			                 return i > ref;                 // but down case 3 we are printing it so output their is false
		                    });           
	
		
//case 2		
/*		l.stream().anyMatch(i -> {
                               System.out.println("Hello");
                                  return i > ref;
                                 }).forEach(---);   // NOTE  as  .anyMatch()  is a terminal operator, so we can not  
*/	                                                // use .forEach() after it.
	
	
// case 3		
		System.out.println(
				             l.stream().anyMatch(i -> {
                                                     System.out.println("Hello");
                                                        return i > ref;
                                                 })
		                   ); // if we put this whole code in syso() method then only it will print false as 
	}                         // stream is empyt

}
