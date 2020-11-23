package app_1_27;

public class Test {

	public static void main(String[] args) throws InterruptedException {

		Thread t = new Thread();
		t.start();
		
		t.join(2000);
		
		System.out.println("----");
	}

}
/*
very intreasting point  .join(2000);   3 points

(1)  if    main Thread and Thread-0   both complete execution and both reach to t.join()
then this method will not wait for 2 sec   . it will execute immeaditely

(2) if One Thread reach to .join()  and second thread till now do not come, then .join()
method wait for the second thread till 2 sec in our case and if after 2 sec  it still 
it does not reach. then the .join() method will execute.

*/