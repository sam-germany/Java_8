package app_03_Factorials_Recursive_Base;

public class Test {
	 
	       public static int m1(int n) {
		
	                         	 if(n < 1) {
	                         		 System.out.println(n);
	        	                   	 return 0;              // return 0;  if we return hier zero
	        	                    }else {                       // then output is zero
	                                  System.out.println(n+"----");  // in copy i clearly explain
	        	                    	return n * m1(n-1);          // easy to understand
                	        	       }
              }
	   public static void main(String[] args) {

		   Test  t = new Test();
		   
		    System.out.println(t.m1(5) + " ====");
		   }}

/*
5----
4----
3----
2----
1----
0----
120

  
  
  
  
 */
