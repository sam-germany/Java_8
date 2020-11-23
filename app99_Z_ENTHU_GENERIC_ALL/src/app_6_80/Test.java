package app_6_80;

import java.util.Arrays;
import java.util.Collections;

public class Test {

	public static void main(String[] args) {

		String [] sa1 = {"charlie", "bob" , "andy" , "dave"};
		
		
		  Collections.sort(Arrays.asList(sa1), null);  // as we pass   null   then Sort() do sorting on DNSO
		  System.out.println(sa1[0]);                  // and as String class bydefault implement Comparable
		
		
		
		
/*  Collections.sort(sa1, null);      this will give us compilation error, as we are not passing  List<> as argument 
 *  
 *Collections.sort() method takes 2 types of arguments          Collections.sort(List<>); 
                            	                                 Collections.sort(sa1, Comparator());
	
	  
	  this is the reason directly putting Array hier will give us compilation error	
			
	*/	
	}

}
