package app_02a_wait_notify;

class ThreadB extends Thread{
	  int total;
	  
	             @Override
	             public void run() {
                    
	            	       synchronized(this) {
	            	    	   
                                   for(int i=0; i<100; i++) {
                                	   total += i;
                                                }
	                          	System.out.println("--------------");    	    
	            	    	   notify();
	                                	       }
	                                }
}
public class ThreadA {
	public static void main(String[] args) {
		
		ThreadB  b = new ThreadB();
		b.start();
		
		        synchronized(b) {
		        	try {
		        		System.out.println("=============");
						Thread.sleep(1000);
						     b.wait();
					} catch (Exception e) {}
		        }
		
		               
		
		
		
	}
	
	
}
