package app_2_36;

import java.util.concurrent.atomic.AtomicInteger;

public class Test2 extends Thread{
	
	 private static class Cstore implements Runnable{
		 
		 int x = 1;
		 
		 private AtomicInteger cps = new AtomicInteger(10);
	 
	      @Override
	    public void run() {
	    	  
	    	  System.out.println("-----");
	    	  
	    	  synchronized(this) {
	    	                  while(x > 0) {
	    	    	                        try {
	    	    		                      //  Thread.sleep(500);
	    	    	                        }catch(Exception e){
	    	              	                      System.out.println(e);
	    	  	                                       }
	    	    	            
	    	    	                 	        x= cps.decrementAndGet();
	    	  
	    	                	              System.out.println(cps);                      
	    	                                }
	    	                  }
	    	  
	    	  System.out.println("-----");
	                       }                           
	 }	
	public static void main(String[] args) {
		
		Cstore cs = new Cstore();         //Cstore  a static  class defined in the Test and main method also in
		                                  //  Test   so we can directly use     Cstore cs = new Cstore();
		Thread t1 = new Thread(cs);     
		Thread t2 = new Thread(cs);      // Main point is  only  one   new Cstore();     one object is created and
		                                 // both 2 threads  are iterating on it.
		t1.start();
		t2.start();
	}}

// in this case i use  synchronized(this){}   outside the while{} loop so only one thread will got the lock for the
//  while{} loop.