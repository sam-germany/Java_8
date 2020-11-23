package app_17_ArrayList_Removing_Duplicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
  
	//public static<T>     hier <T>   is the argument data type that this method can take
	// ArrayList<T>  is the return type for this method
     	public static<T> ArrayList<T> removeDuplicates1(ArrayList<T> l ){
		
	        	ArrayList<T> newList1 = new ArrayList<T>();
		
           		for(T element :l) {
           			  if(!newList1.contains(element)) {
 		       	          newList1.add(element);
				                            }
			                     }
	  	             return newList1;
			
                              		}

    public static void main(String[] args) {

    ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,10,2,2,3,3,10,3,4,5,5));
    
    System.out.println(list1);   
	
    ArrayList<Integer> newList = removeDuplicates1(list1);
    System.out.println(newList);
		
    
    System.out.println("---------------sorting directly through stream----");
  
    
    
    
    List<Integer> l2 = list1.stream()
    		                .distinct()
    		                .collect(Collectors.toList());
    l2.forEach(System.out::println);
    
			
			
			
		
	}

}
