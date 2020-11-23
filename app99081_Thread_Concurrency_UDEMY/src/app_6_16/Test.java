package app_6_16;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

class Player extends Thread{
	
	CyclicBarrier cb;
	
	public Player(CyclicBarrier cb) {
		this.cb= cb;
		this.start();           //   as we do not use ExecutorService   in this code. so we need to 
	}                                // run this Thread. so   as class Player extends Thread       this.start(); 
	                                 //call the run() method rest is easy to understand
      	@Override
	    public void run() {
             try {
            	 System.out.println("---------");
        	    cb.await();
             }catch(InterruptedException | BrokenBarrierException e) {}
     	                 
      	                  }
}

class Match implements Runnable{

	       @Override
         	public void run() {
            System.out.println("Match is starting");		
	                         }
}

public class Test {
	public static void main(String[] args) {          // new CyclicBarrier(2,m1);  means when 2  Threads come to cb.await()
                                                      // method then one time   Match m1  = new Match();  this m1 will 
        Match m1  = new Match();                      // be executed. so one  Match class .run() method we be called once
        CyclicBarrier cb = new CyclicBarrier(2,m1);
       
        Player p1 = new Player(cb);             // hier calling new Player(cb) will execute this.start() and create a Thread
        new Player(cb);                         // hier we are calling it again and second Thread is created.
        
	

	}
}
