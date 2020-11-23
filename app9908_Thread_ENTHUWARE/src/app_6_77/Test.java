package app_6_77;

public class Test extends Thread{
	
	static Object lock1 = new Object();
	static Object lock2 = new Object();
	
	static volatile int i1, i2,     j1, j2,  k1, k2;
	
	 @Override
	public void run() {
   		          while(true) {
   		        	workWithLocks();
   		            workWithoutLocks();
		          }}
	 
	 void workWithLocks() {
	              	 synchronized(lock1) {
			                    i1++;
			                    i2++;
		                 }
		             synchronized(lock2) {
			                    k1++;
			                    k2++;
		                 }
   		             j1++;
		             j2++;
	             }
	                                               // Point 1
	 void workWithoutLocks() {
		 if(i1 !=i2) System.out.println("i");  // retrun false
		 
		 if(j1 !=j2) System.out.println("j"); // as we defined  j1, j2 not in the synchronized() block
		                                      //  so this if() statement return true
		 
		 if(k1 !=k2) System.out.println("k"); // return false
	 }

	public static void main(String[] args) {

		new Test().start();
		new Test().start();
		
	}

}
// Point 2
// for Point 2 read the explanation their it expaing the second point of it