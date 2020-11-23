package app_5_30;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class Test {

	   static class Task1 implements Runnable{
		
		       public void run() {
			         System.out.println("Task-1");
		    }}
	   
	   
	   static class Task2 implements Runnable{
		   
		      public void run() {
			         System.out.println("Task-2");
		
		      
		                           try {
		                        	   Thread.sleep(4500);
		                           }catch(Exception e) {
		                        	   System.out.println(e);
		                                        }
		                   }                  
		      }
	   
	
	public static void main(String[] args) throws InterruptedException {

		final ExecutorService pool = Executors.newFixedThreadPool(2);
		
		Future f1 = pool.submit(new Task1());
		Future f2 = pool.submit(new Task2());
		
		
	    pool.awaitTermination(4,  TimeUnit.SECONDS);  //  .awaitTermination()  this method wait for
		                                                 // 4 sec  after the main thread reaches hier
	                                                  // as the main Thread reaches hier  after 4 second it will
	    pool.shutdownNow();                           //  Terminate the current running operations. as we see in 
//                                                 the output  Task-1 is completed but Task-2   Thread is in the    
//		                                            sleep mode. for  4.5 sec  and hier come the  error as we    
//                                                 put		.awaitTermination(4 sec)   so if we make it
//		                                            .awaitTermination( 5 sec)  then no exception will be thrown
//	
	
}}