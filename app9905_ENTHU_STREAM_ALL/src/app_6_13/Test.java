package app_6_13;

import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		List<String> x  = Arrays.asList("Java EE", "c#","Python");
	     
		boolean flag1 = x.stream().allMatch( str ->{
			                            System.out.println(str);
			                            return str.contentEquals("Java");
		                                    });
		System.out.println(flag1);

		
	System.out.println("-------------------------------");
		
	
	List<String> x1  = Arrays.asList("Java", "c#","Python");
    
	boolean flag2 = x1.stream().allMatch( str ->{
		                            System.out.println(str);
		                            return str.contentEquals("Java");
	                                    });
	System.out.println(flag2);
	
		
	//.allMatch()  if condition return true .allMatch() search further
	
	// if condition return false .allMatch()   stop searching
	
	
	
	}
	


}
