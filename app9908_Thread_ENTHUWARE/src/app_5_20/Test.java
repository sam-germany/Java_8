package app_5_20;

public class Test {

	static class Runner1 implements Runnable{
		
		@Override
		public void run() {
               System.out.println("in Run......");			
		}
	}
	public static void main(String[] args) {

		Test.Runner1  r1  = new Runner1();
		
		Thread t1 = new Thread(r1);
		Thread t2  = new Thread(r1);
		
		t1.start();
		t2.start();
		
		
	}

}
// Note:   for every  .start();    will execute  .run() method saperatelly ,
// for t1  run() method will be executed seperatelly and for   t2  also run() method will
//  execute seperatelly