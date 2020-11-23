package app_13a_CountDownLatch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Processor1 implements Runnable{
	
	private CountDownLatch latch1;
	
	public Processor1(CountDownLatch latch1) {
		this.latch1 = latch1;
	}
	
                  	@Override
	                public void run() {
                       System.out.println("started.....");
		
                            try {
	                  		Thread.sleep(3000);
	                      	} catch (InterruptedException e) {
                                  e.printStackTrace();
		                         }
         
                           latch1.countDown();   //this .coundDown() works like a reverse clock point only.       
             	                      }         // all 3 Threads in our code execute .run() method and come to 
                                                // .counDown() method before exiting the .run() method and make this
                                                // .countDown() method from 3-2-1 to 0 , when it reach to 0 then a 
}                                               // internall call goes to .await() method  that it can not let the 
                                                // main Thread for further execution
	                                            //Point. once .counDown() reaches 0 , then we can not reuse it or 
	                                            // we can say we can not reinitialize it with any new value 
public class Test {                              // like again 3 for reusing
	public static void main(String[] args) {                                                    
		CountDownLatch latch2 = new CountDownLatch(3); // countdown starts from 3 till 0
	
		ExecutorService exe1 = Executors.newFixedThreadPool(3);
		
		for(int i=0; i<3; i++) {
			exe1.submit(new Processor1(latch2));
		}
		
		
		try {
			System.out.println("======");        // the main_Thread executes and come inside this try{} block and wait  
			latch2.await();                           //for this .await() method to execute, this .await() method will be
		}catch (InterruptedException e) {       //internally get free signal for execution when the .countDown()  
                e.printStackTrace();            // become 0,  now .await() get free signal and  main-Thread execute
		}                                       //this .await() method and  execute further to complete the rest code.
		
		System.out.println("Completed-----");
	
	     exe1.shutdown();
	
	}}
