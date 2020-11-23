package app_6_15;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
// in this code just play with the int values of ThreadPool() and CyclicBarrier() then come the exact understanding of flow
//  like put 1 and 2 or 1 and 1  or 2 and 1 in both of them.

class Player2 extends Thread{
    	CyclicBarrier cb;

     public Player2(CyclicBarrier cb) {
    	 System.out.println("----");            // just for checking when this constructor will be called, as shown it
    	 this.cb = cb;                           // is called before the .run() method
     }

     @Override
    public void run() {
             try {
            	 System.out.println("Player class...");
            	 
            	 cb.await();
             }catch(InterruptedException | BrokenBarrierException e ) {}
                }
 }
class Match2 implements Runnable{
	
	@Override
	public void run() {
              System.out.println("Match is starting.....");   //new CyclicBarrier(1, m1);  means 1 Thread come to cb.await()
               	}                                              // then  Match2 m1 = new Match2();  Match2 class .run() method
}                                                              // will be executed one time, so 2 threads come one by one
public class Test {                                           // or same time to cb.await() and after that 2 time 
	public static void main(String[] args) {                     // Match2 class  run() method will be executed.

		      Match2 m1 = new Match2();                        // hier we created  CyclicBarrier with 1 thread means when    
		      CyclicBarrier cb = new CyclicBarrier(1, m1);     // 1 thread reach the cb.await() method it trip the barrier
		                                                            // and at end the  class Match    .run() method will be  
		      ExecutorService es = Executors.newFixedThreadPool(2);   // executed, but in  ThreadPool(2)  we created 2 threads     
		                                                            // and we are  executing 2 times  es.execute(new Player(cb));
		      es.execute(new Player2(cb));                      // means 2 new threads are created, when first Thread come to 
		      es.execute(new Player2(cb));                      // cb.await(); it trip the barrier and call the  class Match()
	                                                             	   // .run() method, so same will be done by second Thread
		      es.shutdown();                           
	}}


/*   CyclicBarrier cb = new CyclicBarrier(2, m1);     their are 2 constructor of CyclicBarrier 1 take ( int count)
                                                      and second take( int count, Runnable) 
  
 Point(1) 
 little trickey.  the main point is   Executors.newFixedThreadPool(1);  it has only 1 thread  and we 
 submit 2 tasks   es.execute(..);   so normally this only one thread has to do these both 2 tasks,
 first it will execute task-1  then after completing it will execute task-2  but in the CyclicBarrier(2,m1)
 we use 2 , it means their must be 2 threads  must hit the   cb.await() method only after that we can trip
 the CyclicBarrier()  but as Executor has only 1 thread so  the Barrier will never be tripped.
 
 
 
 
 */
