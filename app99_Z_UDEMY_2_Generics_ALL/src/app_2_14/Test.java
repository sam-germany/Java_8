package app_2_14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		List<? super String> l = new ArrayList<>(Arrays.asList(10,20));
		
		l.add("A");
		l.forEach(System.out::println);

		
		System.out.println("----------------------------");
		
		
		
/*		    List<? exetnds String> l2          because when we use whildcard with <? extends String> then not      
	                                           alloweed to .add() anything
	
		  List<T extends String>                as String is a final Class so we can not exentd it.                             
		                                                                 
		                                                                 
*/		
	}

}
