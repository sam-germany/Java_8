package app_1_21;

import java.util.Arrays;

public class Test {
                                                       // "null"  in case of null it will be put at end so at 4 index
	static String [] sa = {"a","aaaa","aaa","aa"};   //   - (insertion index Nr )+ 1    =     (-4 + 1 ) -1  makes  -5    
	                                                 //  this is the reason for  "null"  we get  -5 as output
	static {
		Arrays.sort(sa);
	}

	public static void main(String[] args) {

     for(String i :sa) {
    	 System.out.println(i);
     }

     String search  ="aa";
  
     System.out.println(args.length);  // 0
     
     if(args.length != 0) 
    	 search = args[0];
		
     System.out.println(Arrays.binarySearch(sa,search));   // if we  search for "aa"  then for "aaaa" it return true   
                                                             // for "aaa" also it return true
                                                             // for "aa"  also it return true
     System.out.println(Arrays.binarySearch(sa, "null"));    //  but for "a"  this search will not return true
     
	}

}
