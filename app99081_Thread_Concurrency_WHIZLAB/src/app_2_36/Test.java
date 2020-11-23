package app_2_36;

import java.util.concurrent.atomic.AtomicInteger;

public class Test extends Thread{
	
	 private static class Cstore implements Runnable{
		 
		 int x = 1;
		 
		 private AtomicInteger cps = new AtomicInteger(10);
	 
	      @Override
	    public void run() {
                   
	    	                while(x > 0) {
	    	    	                        try {
	    	    		                      //  Thread.sleep(500);
	    	    	                        }catch(Exception e){
	    	              	                      System.out.println(e);
	    	  	                                       }
	    	    	            
	    	    	                         synchronized(this) {
	    	    	                 	        x= cps.decrementAndGet();
	    	     	                                         }
	    	  
	    	                	              System.out.println(cps);                      
	    	                                } 
	    	                                       //the point is when one Thread-0  x= cps.decrementAndGet();
	                       }                      //reach this point  then x=10  become x=9  but before it go to
	 }                                           //print through syso()  another Thread-1 come to  x= cps.decrementAndGet(); 
	                                              //and make  x=9  to x=8, as now x=8  and after this both Threads will  
	                                              //come to syso() and  can also print 8 8  in the begining, see the 
	public static void main(String[] args) {       // output as i save
		
		Cstore cs = new Cstore();         //Cstore  a static  class defined in the Test and main method also in
		                                  //  Test   so we can directly use     Cstore cs = new Cstore();
		Thread t1 = new Thread(cs); 
		Thread t2 = new Thread(cs);        // Main point is  only  one   new Cstore();     one object is created and  
		                                   // both 2 threads  are iterating on it.
		t1.start();
		t2.start();
	}}

/*
 Output is
--------------------
8
8
7
6
5
4
3
2
1
0


 */
