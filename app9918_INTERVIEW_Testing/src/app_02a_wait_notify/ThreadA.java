package app_02a_wait_notify;


class ThreadB extends Thread{
	int total;
	
	      @Override
	      public void run() {
		         synchronized (this) {  // hier we are maiking a lock on  .run() method
			         
		        	  for(int i=0; i<10; i++) {
			            	        total += i;
			                            }
		        	  System.out.println("--------------");
			                  notify();                          // notify();  method we should not put in try/catch
			                      }
	                    }
}
public class ThreadA {
	public static void main(String[] args) {

		ThreadB b = new ThreadB();
		b.start();
		
      		synchronized (b) {  // hier we are maiking a lock on (b) means (ThreadB) object
		            	try {
				         System.out.println("waiting for b to complete.....");
			                 b.wait();
			              }catch(InterruptedException e) {
		         		System.out.println(e);
			                          }
			
		          	System.out.println("Total is:  "+ b.total);
	  	                 }
		
	}}

/*  hier main Thread execute  b.start();  and new thread started and execute the .run() method
    as we use in .run()  synchronized(this) it means that this new Thread will get a lock on 
    this .run() method and it go inside it and start executing the for() loop
    
    hier main therad executed and it enter  synchronized(b)  and go to  b.wait();  and waiting for
    the new Thread to come to  notify() method. as  it come to  notify() method internally it 
    it make free for b.wait();  method. now  .wait() method is free and main Thread execute the 
    .wait() method and execute the complete code.
 
 
 
 */


/*
https://www.programcreek.com/2009/02/notify-and-wait-example/

1) synchronized keyword is used for exclusive accessing.
2) To make a method synchronized, simply add the synchronized keyword to its declaration. 
Then no two invocations of synchronized methods on the same object can interleave with 
each other.
3) Synchronized statements must specify the object that provides the intrinsic lock. 
When synchronized(this) is used, you have to avoid to synchronizing invocations of 
other objects' methods.
4) wait() tells the calling thread to give up the monitor and go to sleep until some 
other thread enters the same monitor and calls notify( ).
5) notify() wakes up the first thread that called wait() on the same object.

*/