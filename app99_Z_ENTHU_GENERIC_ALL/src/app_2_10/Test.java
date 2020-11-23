package app_2_10;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Test {

	public static void main(String[] args) {

		List<String> li = new ArrayList<>();
		
		li.add("a");
		li.add("e");
		li.add("i");
		li.add("o");
		li.add("u");
		
		                                               // List.subList( start index, end index);
		
		Function<List<String>, List<String>> f = x -> x.subList(2, 4); // easy to understand this Function<> it 
	                                                                //takes a List<String> and return a List<String>
		System.out.println( f.apply(li));
	    
	    li.forEach(System.out::print);
	    
	    
	    System.out.println("-------------------");
	    // to put changes to original list 
	    
	    List<String> l2   = f.apply(li);
        l2.add("xxx");
	    
        l2.forEach(System.out::println);
	    
	    
	
	}

}
