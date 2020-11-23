package app_3_84;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		ArrayList<Integer> source1 = new ArrayList<>();
		
		source1.addAll( Arrays.asList(1,2,3,4,5,6));
		
		List<Integer> destination1 =  Collections.synchronizedList(new ArrayList<Integer>());
		
		
		
		source1.parallelStream()                        // very intresing see how the add the element with
		      .peek( x -> destination1.add(x))          //  .parallelStream()  and display them with the
		      .forEachOrdered(System.out::print);       // .forEachOrdered() but as we print the  destination1.stream() 
		                                                 // then it shows how it is inserted.    
		
		System.out.println(".....................");
		
		
		
		destination1.stream()
		            .forEach(System.out::print);
		
		
		
	}

}
