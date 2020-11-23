package app_4_75;

public class Test extends Thread{

	  private static int threadcounter = 0;
	  
	  @Override
	public synchronized void run() {  
         threadcounter++;            
                                     
         
         System.out.print(threadcounter+ " ");
	  
	  }
	
	public static void main(String[] args) {
	
		
		for(int i=0; i<10; i++) {
			synchronized(Test.class) {
				new Test().start();
			}
		}}}

/* Note: for understanding every time  .start() executes then a new Thread is created
         and for every Thread  a seperate .run() method will be executed, it looks like
         that all the Threads will use in this example same .run() method but internally
         they all use a seperate .run() method
         
   for understanding purpose i make this run() method  also synchronized but it will not 
   help as the static int threadcounter     is outside  the run() method,
   
   point: that as it is a   static lock  see the explanation in copy
   
   2 2 3 4 5 6 8 7 9 10      this can be a expected output
   
   static int threadcounter =0;   eventhough we have a lock on the whole class object think that
   this Test class object in Heap area but still static variable are not in the object, they are in
   static area, as shown in the above output, assume  t1 start first and make threadcounter = 1;
   but before it going to print through syso()   t2 execute and make threadcounter =2.
   in this sanerio both t1 and t2  will print 2 2   as showin the the above output.


*/