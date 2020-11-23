package app_6_20;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		Callable<String> c = new Callable<String>() {
                                                   @Override
                                                public String call() throws Exception {

                                                	   try {
                                                		   Thread.sleep(1);
                                                	   }catch(InterruptedException e) {}
                                                	   return "Hello123";
                                                                         } 
		                                          };
		                                          
		  ExecutorService es = Executors.newFixedThreadPool(10);
		  List<Callable<String>> l = Arrays.asList(c,c,c,c,c);  //hier it convert Array element into Callable<String>
		                                                         
		  List<Future<String>> f = es.invokeAll(l);    //(1).invokeAll();   method works Synchronous mode so all threads
		                                               // will be stop hier, inclusive  Main Thread also, as the
		  System.out.println("------------");          // .invokeAll() method finish its execution and return result
		                                               // after that all the Threads (main and Callable) will execute 
		  System.out.println(f.size());                // further, this is the reason   "-----" this will print first
		  
                                                    // (2)  es.invokeAll()    will internally call new Callable<String>()
		  for(Future<String> x: f) {                // this is the reason all  we get  "Hello123"  5    times 
			  System.out.println(x.get());             
		  }
		  es.shutdown();
	}}
/*
   the main point is  .invokeAll(list);   we use (c,c,c,c,c)  as argument , we use  .invokeAll(list);
   it means we have in Arrays.asList() we have 5 arguments they all execute 5 times parallely
   as we have 10 threads. as per 5 arguments the .call() method will be called 5 times so 
   this is the reason   we will get  "Hello123"  will returned  back as Future<String>  object.

 
 */

