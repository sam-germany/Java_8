package app_6_06;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyThread implements Runnable{
	private String str;
	
	MyThread(String str){
		this.str = str;
	}

	@Override
	public void run() {
		System.out.println( str.toUpperCase());
	}
}
public class Test {
	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService es = Executors.newSingleThreadExecutor();
		
		MyThread thread = new MyThread("ocp..");
		
		Future f = es.submit(thread);       // first constructor is called then the .run() method
		
		Integer tmp = (Integer) f.get();   // red explanation how this works
		
		System.out.println(tmp);
		
		es.shutdown();
	}}
/*
   <T> Future<T> submit(Runnable task, T result);      asynchronous mode
   <T> Future<T> submit(Callable<T> task);            asynchronous mode
  
          void execute(Runnable command);'
  
 
 */

