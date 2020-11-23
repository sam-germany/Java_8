package app_4_78;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyCallable implements Callable<String>{
	
	
	
	public String call() throws Exception{
     		Thread.sleep(5000);
		return "DONE";
	}
}

public class Test {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService es  = Executors.newSingleThreadExecutor();
		
		Future<String> f = es.submit(new MyCallable());
		
		System.out.println(f.isDone());  // as per explanation this boolean method retun immeaditely
		
		System.out.println(f.get());  // .get() method wait till the execution of .call() method
		                              // completed and it return a value or exception , read explantion
		es.shutdown();
	}

}
//  ExecutorService   .get() throws InterruptedException, ExecutionException