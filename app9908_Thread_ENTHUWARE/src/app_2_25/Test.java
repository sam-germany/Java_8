package app_2_25;

public class Test {

	static StringBuffer sb1  = new StringBuffer();
	static StringBuffer sb2 = new StringBuffer();
	
	public static void main(String[] args) {

		new Thread(     new Runnable() {
   					                 	@Override
					             	public void run() {

							             synchronized(sb1) {
								                sb1.append("X");
								                     synchronized(sb2) {
								                 	   sb2.append("Y");
								                }}
							   
							            System.out.println(sb1);
   						                }}
			).start();
	
		
		new Thread(     new Runnable() {
                  					@Override
					          	public void run() {
                            
                  				       synchronized(sb2) {
                                	          sb2.append("A");
                                	              synchronized(sb1) {
                                	    	           sb1.append("B");
                                	      }}
                  				       
                                  System.out.println(sb2);
			                			}}
				).start();
	}}
/* main point as StringBuffer both objects are static so every time same object is called
  output       X 
               YA
               
normally we are getting this output, as (sb1) append   "x"  and then  syso(sb1)    but after printing we 
appending   sb1   "x"+"B"    this is the reasaon we get only   "X"   as output.
                 
               


*/