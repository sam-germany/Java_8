package app_1_66;

public class Test extends Thread{
	boolean flag = false;
	
	public Test(boolean f) {
		flag = f;
	}
	
	static Object obj1  = new Object();   // main point as we are using static obj1, obj2   means that these objects
	static Object obj2 = new Object();    // are created only one time and as we are calling from main method 2 times
	                                       // but the first time created objects will be called again, as the first 
	public void m1() {                    // thread is not able to complete execution so thes are blocking with 
		synchronized(obj1){              // each other, but if we do not use   keyword   static hier then it means
			System.out.println("1");      //for both the therads we are calling 4 different objects are called so they
			                                // will never block each other.
			        synchronized(obj2){
			       	System.out.println("2");         // the main point is hier   static obj1, obj2   is that hier the
               }}}                                 // objects are static and same object are shared in both the mehtods
	                                               // so these when use with synchronied() then it is easy that they can be
	public void m2() {                             // come in dead lock situation, but if we  remove the static keyword
		synchronized(obj2) {                       // then their is no issue as the thread can wait for the 
			System.out.println("3");              // synchronized(){}  method to be free and after that it execute it.
		
		         synchronized(obj1) {
		        	 System.out.println("4");
		       }}}
	
	public void run() {
		if(flag) {
			m1();
			m2();
		
		}else {
			System.out.println("--------");
			m2();
			m1();
		}
	}
	public static void main(String[] args) {

		new Test(true).start();
		new Test(false).start();		
		
	}

}
