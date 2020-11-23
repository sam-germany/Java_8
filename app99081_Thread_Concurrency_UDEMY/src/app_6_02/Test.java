package app_6_02;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class A1 implements Callable<Void>{   // if we replace  from Void to void  then this code will not compile
	
	   String str1;

	   public A1(String s) {
		   this.str1= s;
	   }
	   

	   @Override
    	public Void call() throws Exception {     //Note: as it looks like return type is void then how it return 
                                                       // anything. but see it is  Void  not void   V is capital
		   System.out.println(str1.toUpperCase());     // this is special type we can use with callable
		   return null;                        
	   
	    }                                        // main point    <Void>   it can return only  null   as this  
}                                                // .call()   is returning  if we try to return anything else 
                                                  // we will get compilation error , this is main point.
public class Test {
	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService es  = Executors.newSingleThreadExecutor();
		
		Future<Void> f = es.submit(new A1("sunny"));
		
		System.out.println(f.get());  // Future Interface .get() throws InterruptedException, ExecutionException
		
		
		es.shutdown();
	}}