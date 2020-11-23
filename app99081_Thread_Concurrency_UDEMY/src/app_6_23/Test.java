package app_6_23;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test {

	private static void print1() {
		System.out.println("Print..");
	}
	
	private static Integer get1() {
		return 10;
	}
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService es = Executors.newFixedThreadPool(10);
		
		Future<?> f1 = es.submit(Test::print1);
		Future<?> f2 = es.submit(Test::get1);
		                                           // read Explanation
		System.out.println(f1.get());   // as .submit(Runnable); return "null" when task succesfully completed
		System.out.println(f2.get());   // as .submit(Callable);  return the value as "10"  is printed
		
		es.shutdown();
		
}}
/*
  Note:  if we do not define both  print1() and get1()  method as static then we can not call them
  (Test::print1);  (Test::get1);  like this we can not call them.
  
  
 
 
*/