package app_0_36;

import java.util.Arrays;

public class Test {
    
	 public static void main(String[] args) {
	
		 String [] li = {"1","2","3"};
//		                            0  ->              "0"   + li[0]  = "0" + "1" = 01   
		 Arrays.parallelSetAll(li , x  -> Integer.toString(x)+ li[x]);//           output      
		 
		 System.out.println(li[0]);  // first li[0]  we put  "0"  so as shown above how
                                    //  0th index is "1"                                     		 
		 
		 
		 
		 System.out.println(li[1]);
		 System.out.println(li[2]);
		 
}
}
