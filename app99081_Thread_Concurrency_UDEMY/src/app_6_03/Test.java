package app_6_03;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class A1 implements Callable<Integer>{
	
	private Integer i;
	
	public A1(Integer i) {
		this.i = i;
	}
	
	@Override
	public Integer call() throws Exception {

		return --i;
	}
}
public class Test {
	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService es = Executors.newSingleThreadExecutor();
		                                           // as we use Callable     hier submit() method return Future obj
		A1  a  = new A1(100);                      //to get this Future object we need to use  .get() method
		System.out.println(es.submit(a));           // this .get() method is defined in Future interface
		System.out.println(es.submit(a).get());   // 
		
		System.out.println("-----------------");
		
		A1  a2  = new A1(100);
		System.out.println(es.submit(a2).get());
		System.out.println(es.submit(a2).get());

		
		es.shutdown();
		
		
	}

}
