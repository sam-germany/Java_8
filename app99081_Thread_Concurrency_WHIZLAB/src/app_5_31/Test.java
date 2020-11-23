package app_5_31;

public class Test {

	private static class CStore  implements Runnable{
		
		int cps = 10;
		
		          @Override
		          public void run() {

	       	              while(cps >0) {
		            	            	  try {
		            	            		  Thread.sleep(1500);
		            	            	  }catch(Exception e) {
		            	            		  System.out.println(e);
		            	            	  }
		            	            	  
		            	                   synchronized(this) {
		            	          		              cps-=1;
		            	          	                     }       
		            	            	  
		            	                       System.out.println(cps);
		            	              	   }
               	                }
	}
	public static void main(String[] args) {
           
		CStore  cs = new CStore();
		
		Thread t1 = new Thread(cs);
		Thread t2 = new Thread(cs);
		 
		t1.start();
		t2.start();
		
	}}

// same type of question i already had in last chapters.
