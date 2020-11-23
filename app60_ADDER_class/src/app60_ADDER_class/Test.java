package app60_ADDER_class;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.LongAdder;

public class Test  implements Runnable{
	
	private final LongAdder counter;
	
	public Test(LongAdder counter) {
		this.counter = counter;
	}
	
	@Override
	public void run() {
    counter.increment();	
	}

	public static void main(String[] args) throws InterruptedException {
 
		LongAdder counter = new LongAdder();
		
		ExecutorService service = Executors.newFixedThreadPool(16);
		for( int i=0; i <5;i++) {
			service.submit(new Test(counter));
			
			Thread.sleep(2000);
      System.out.println(counter.sum());
		}
	}

	
	
}
