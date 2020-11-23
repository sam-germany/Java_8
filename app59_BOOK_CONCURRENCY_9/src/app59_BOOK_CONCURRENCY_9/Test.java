package app59_BOOK_CONCURRENCY_9;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {

	private void m1(CyclicBarrier c) {
		try {
			c.await();
		}catch(Exception e) {}
	}
	
	public void m2(CyclicBarrier c){
		ExecutorService s = Executors.newSingleThreadExecutor();
		
		for(int i =0; i<12; i++) {
			s.execute(() ->m1(c));
			
		}
		s.shutdown();
	}
	public static void main(String[] args) {

		new Test().m2(new CyclicBarrier(1, ()-> System.out.println("ready")));
		
	}

}
