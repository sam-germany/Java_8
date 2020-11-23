package app_3_20;

import java.util.concurrent.atomic.AtomicInteger;

public class Test {

	 public AtomicInteger status = new AtomicInteger(0);
	 
	 public void m1() {
		 int x = status.get();
		 System.out.println(x);
		 
	   	 status.compareAndSet(0, 1);     // boolean compareAndSet(oldValue, newValue);
		 System.out.println(status);       //   as old value is same  so now oldValue is replaced with new

		 status.compareAndSet(5, 7);
		 System.out.println(status);      //   as old value is not same  so now oldValue is not replaced with new
		 
		 
	 }
	public static void main(String[] args) {

		  new Test().m1();
		
	}

}
