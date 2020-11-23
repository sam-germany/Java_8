package app_0_31;

public class Test implements Runnable{


	@Override
	public void run() {
          System.out.println(Thread.currentThread().getName() + " ****** ");
	}
	
	public static void main(String[] args) {

		Test a1 = new Test();
		
		Thread t1 = new Thread(a1);
		
		System.out.println(Thread.currentThread().getName()   +" ########");
		
		//t1.setName("from a1..");
		
		t1.start();
		
		
		System.out.println(Thread.currentThread().getName()   +" ----");
		
		
		
		try {
			t1.join();                           // read the explanation about  .join() method
			System.out.println("--- aftert - join() method--");
		} catch (Exception e) {
                 System.out.println(Thread.currentThread().getName() +"  ===");
		}}}

// as 2 Threads are exectuing  .join() method waits for both the threads and after that it will execute
// this is the reason that .join() method will execute always at end.