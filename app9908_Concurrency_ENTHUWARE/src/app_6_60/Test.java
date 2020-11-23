package app_6_60;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {

	public static void main(String[] args) {

		Runnable r1 = ()-> System.out.println("In Runnable----");
		
		Callable<Integer> c1 = () -> {
			                       System.out.println("In Callable");
			                         return 0;                        //  as call() method  return value
		                             };                               // so we use hier return 0;
		
		 ExecutorService es = Executors.newCachedThreadPool();                            
		              
		 es.submit(r1);
		 es.submit(c1);
		 
		 
		 es.shutdown();
	
	
}}