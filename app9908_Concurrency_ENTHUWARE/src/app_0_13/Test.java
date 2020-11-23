package app_0_13;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

class Control{
	
	private final ScheduledExecutorService s1 = Executors.newScheduledThreadPool(1);

	
	 public void m1() {
		 final ScheduledFuture<?> s2= 
		            		 s1.scheduleAtFixedRate(() -> System.out.println("beep"),2,2, TimeUnit.SECONDS);
		         
		 s1.schedule(() -> s2.cancel(true), 5 *5, TimeUnit.SECONDS);
		 
	 }}
public class Test {

	public static void main(String[] args) {

		 new Control().m1();
	}}

/*  .scheduleAtFixedRate(Runnable);    this method() takes a Runnable Interface as argument so we are calling
         
     ()->  lambda expression hier internally .run() method  and we defined  that this "beep" will be printed 
     continously after 2 second. it print just further infinitely.......
     
     
     s1.schedule( callable--- call());        with this .schedule() method we have hier defined that till which
     time after the execution this code  should execute. and 
   

  
  
  
 */
