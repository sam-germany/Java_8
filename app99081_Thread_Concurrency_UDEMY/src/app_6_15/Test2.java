package app_6_15;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
// in this code just play with the int values of ThreadPool() and CyclicBarrier() then come the exact understanding of flow
//  like put 1 and 2 or 1 and 1  or 2 and 1 in both of them.

class Player extends Thread{
    	CyclicBarrier cb;

     public Player(CyclicBarrier cb) {
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
class Match implements Runnable{
	
	@Override
	public void run() {
              System.out.println("Match is starting.....");
               	}                                             //new CyclicBarrier(2, m1);  means 2 Threads come to cb.await()
}                                                              // then  Match m1 = new Match();  Match class .run() method
public class Test2 {                                              // will be executed one time ,so 2 threads come one by one           
	public static void main(String[] args) {                      // or same time to cb.await() and after that 2 time 
		                                                         // Match2 class  run() method will be executed.
		      Match m1 = new Match();                        
		      CyclicBarrier cb = new CyclicBarrier(2, m1);         
		                                                           
		      ExecutorService es = Executors.newFixedThreadPool(2);  
		                                                           
		      es.execute(new Player(cb));                        
		      es.execute(new Player(cb));                   
		                                                    
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
