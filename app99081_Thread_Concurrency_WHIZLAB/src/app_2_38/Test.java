package app_2_38;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
public class Test {
	
	        static class Task1 implements Callable<Integer>{
		
		        @Override
        		public Integer call() throws Exception {
			       return 1;
		     }}
	
	        static class Task2 implements Callable<Integer>{
	        	
	        	@Override
	        	public Integer call() throws Exception {
	        		return 2;
	       	}}
	        
	        
	        static class Task3 implements Callable<Double>{
	        	
	        	@Override
	        	public Double call() throws Exception {
	        		return 3.0;
	         }}
	        
	public static void main(String[] args) throws InterruptedException, ExecutionException {

		final ExecutorService pool = Executors.newFixedThreadPool(5);
		
		List<Callable<Integer>>  cal = new ArrayList<>();
		
		cal.add(new Test.Task2());           // cal.add(new Task2());
		cal.add(new Test.Task1());           // cal.add(new Task1());      with this type we can also call the Test()  
		
	//	cal.add(new Test.Task3());      as Task3 is of Double wrapper type so we can not  add this, compilation error 
	//                                  and we provide as return type  List<Future<Integer>>	
		
		List<Future<Integer>> futures = pool.invokeAll(cal);
		
		
		for(Future<Integer> x: futures) {
			
			System.out.println(x.get());
		}
		
		pool.shutdownNow();
		
		
	}}

/*Note:  as already exmplains   Runnable (I)  run() method do not return anything
        
       Callable (I)  call()  method return Future Object, so hier in this code we use  Callable and it return 
       
      Future Object, rest is easy to understand.
  
  
  
  
 
 */
