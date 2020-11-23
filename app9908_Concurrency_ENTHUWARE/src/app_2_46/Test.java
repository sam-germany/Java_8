package app_2_46;

import java.util.concurrent.atomic.AtomicInteger;

public class Test {
	
	  static AtomicInteger ai = new AtomicInteger(0);
	

	  public static void m1() {
		  System.out.println( ai.incrementAndGet() );
	  }
	  
	  public static void m2() {
		  System.out.println( ai.addAndGet(1) );
	  }
	  
	  
	public static void main(String[] args) {


		new Test().m1();
		new Test().m2();

	}

}
