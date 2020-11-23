package app_6_05;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyCallable1 implements Callable<Integer>{
	private Integer i;
	
	public MyCallable1(Integer i) {
		this.i  = i;
	}
	
	@Override
	public Integer call() throws Exception {

	    return --i;
	}}

class MyThread1 extends Thread{
	private int i;
	
	MyThread1(int i){
		this.i = i;
	}
	
	@Override
	public void run() {
        i++;    
	}}
public class Test {
	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService es = Executors.newSingleThreadExecutor();
		
		MyCallable1 c1= new MyCallable1(10);
		System.out.println(es.submit(c1).get());
		
		
		MyThread1 thread = new MyThread1(10);
		System.out.println(es.submit(thread).get());  //hier we are calling the .run() method of the
		                                             //myThread1 extends Thread   class
		                                             // but as   void  run();  method  it does not return
		es.shutdown();                               // anything, but if execution is successful and also no 
		                                            // exception comes then   "null"  will be returned by 
		                                           //void run();    method, this is point as it is void and still
	}                                               // return  null;
              // we must use  hier also .get() method to get the returned object.
}
