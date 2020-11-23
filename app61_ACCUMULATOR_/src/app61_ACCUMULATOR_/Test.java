package app61_ACCUMULATOR_;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.LongAccumulator;
import java.util.concurrent.atomic.LongAdder;




public class Test  implements Runnable{
	
	private final LongAccumulator counter;
	
	public Test(LongAccumulator counter) {
		this.counter = counter;
	}
	
	@Override
	public void run() {
    counter.accumulate(1);;	
	}

	public static void main(String[] args) throws InterruptedException {
 
		LongAccumulator counter = new LongAccumulator((x,y) -> x+y, 0);
		
		ExecutorService service = Executors.newFixedThreadPool(16);
		for( int i=0; i <5;i++) {
			service.submit(new Test(counter));
			
			Thread.sleep(2000);
      System.out.println(counter.get());
		}
	}

	
	
}
