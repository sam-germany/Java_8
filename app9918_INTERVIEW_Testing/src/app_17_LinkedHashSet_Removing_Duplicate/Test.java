package app_17_LinkedHashSet_Removing_Duplicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Test {
	
	     public static <T> ArrayList<T> removeDuplicate1(ArrayList<T> l){
	    	 
	    	 Set<T> set1 = new LinkedHashSet<>();
	    	                        // as ArrayList() can have duplicates, so hier in LinkedHashSet()
	    	 set1.addAll(l);       // we are putting the ArrayList and it internally remove
	    	                        // the duplicate elements, put unique in the Set<T>
	    	 
	    	 l.clear();           // .clear()  method we remove all the elements of ArrayList<T>  
	    	 
	    	 l.addAll(set1);   //now again we are putting the   non-duplicate elements in 
	    	                      // the empty ArrayList
	    	 return l;
	     }

	public static void main(String[] args) {

		ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,10,2,2,3,10,3,3,4,5,5));
		System.out.println(list1);

		ArrayList<Integer> newList1 = removeDuplicate1(list1);
		System.out.println(newList1);
		
		System.out.println("---------------------");
		
		
		List<Integer> l2 =  list1.stream()
				                 .distinct()
				                 .collect(Collectors.toList());
		
		System.out.println(l2);
		
		
		
	}

}
