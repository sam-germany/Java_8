package app_6_30;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class A1 {

	   public static class MyTask implements Callable<String>{
		
           		      @Override
		              public String call() throws Exception {
   
	        	                 try {
	                            		Thread.sleep(2000);
	                            	}catch(InterruptedException ex) {
			                          ex.printStackTrace();
		                                  }
	        	                 
	        	                 System.out.println(Thread.currentThread().getName());
        		     return "Data From  "+  Thread.currentThread().getName();
	        	      }
	              }
}

public class Test{	   
	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService es  = Executors.newFixedThreadPool(2);
		
		A1.MyTask task1 = new A1.MyTask();
		
		Future<String> result = es.submit(task1);
		
          
		  while(!result.isDone()) {
			
			     try {
			  Thread.sleep(1000);                        // Thread.sleep(); method thorows InterruptedException, as it  
			     }catch(InterruptedException e) {        // checked Exception so we need to put in try/Catch block
			    	 e.printStackTrace();
			     }}
		  
		  System.out.println(result.get());   // Future.get()   this .get() method of the Future Interface
		  es.shutdown();                      // .get() throws InterruptedException, ExecutionException 

}
}