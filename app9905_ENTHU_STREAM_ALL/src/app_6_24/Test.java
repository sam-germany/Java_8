package app_6_24;

import java.util.Arrays;
import java.util.List;

public class Test {                                                        //   a .compareTo("c") <  0    =   -1     
                                                                       	 //   c .compareTo("c") <  0      =   0
                                                                       	 //   d .compareTo("c") <  0      =   1
	public static void main(String[] args) {

		List<String> al = Arrays.asList("aa","aaa","b","cc","ccc","ddd","a"); 
		
                 		long count =    al.stream()
		                		          .filter((str) -> str.compareTo("c") < 0) //  "aa", "aaa" ,"b" , "a"
		                		          .count();  // count() method return long
		
		System.out.println(count);
	    
		
		System.out.println("-------------------");
		
		
	                    	long count1 = al.stream()
	                    			        .filter((str) -> str.compareTo("c") < 0)
	                    			        .sorted()
	                    			        .count();
	                    	
		System.out.println(count1);
	}

}
