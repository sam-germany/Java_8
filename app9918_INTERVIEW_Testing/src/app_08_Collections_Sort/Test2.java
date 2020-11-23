package app_08_Collections_Sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test2 {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("James", "diana", "anna","james");
 		
		Collections.sort(names, new Comparator<String>() {
			                                   public int compare(String x, String y) {
			                                       return x.compareToIgnoreCase(y);
			                                                }
		                                                 });
    	  System.out.println(names);
	
    	  
	  Collections.sort(names, new Comparator<String>() {
                                              public int compare(String x, String y) {
                                                       return x.compareTo(y);
                                                          }
                                                        });
               System.out.println(names);
	  
        
      Collections.sort(names, new Comparator<String>() {
                                              public int compare(String x, String y) {
                                                    return y.compareTo(x);
                                                         }
                                                     });
              System.out.println(names);
               
	}

}