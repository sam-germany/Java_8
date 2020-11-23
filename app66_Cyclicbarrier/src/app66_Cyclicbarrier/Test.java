package app66_Cyclicbarrier;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

class A1 implements Runnable {
	
    public static int product = 0; 
   
                 public void run(){ 
                            product = 2 * 3; 
         
                        try{   
                            Test.newBarrier1.await(); 
                          }catch (InterruptedException | BrokenBarrierException e){ 
                      e.printStackTrace(); 
           }} 
    } 
class B1 implements Runnable {
	
    public static int sum = 0; 
   
             public void run() { 
                        // check if newBarrier is broken or not 
                     System.out.println("barrier broken? ---" + Test.newBarrier1.isBroken()); 
                        sum = 10 + 20; 
        
                  try{ 
                      Test.newBarrier1.await(3000, TimeUnit.MILLISECONDS); 
          
                      // number of parties waiting at the barrier 
                 System.out.println("Nr of Thread waiting at barrier-- "+ Test.newBarrier1.getNumberWaiting()); 
        
                     }catch (InterruptedException | BrokenBarrierException e){ 
                          e.printStackTrace(); 
                     }catch (TimeoutException e){ 
                          e.printStackTrace(); 
                      } 
                 } // hier end the   .run() method
}
public class Test implements Runnable {
	
    public static CyclicBarrier newBarrier1 = new CyclicBarrier(3);  // hier we create 3 CyclicBarrier as after that
                                                                     // we use  newBarrier1.await(); method
    public static void main(String[] args)                                    
    { 
        // parent thread 
        Test test = new Test(); 
          
        Thread t1 = new Thread(test); 
        t1.start(); //  from hier first thread is running
    } 
                public void run(){ 
                     System.out.println("Nr of Threads created "+ newBarrier1.getParties()); 
                     
                     System.out.println("Sum of product + sum = " + (A1.product +  B1.sum)); 
          
                         // objects on which the child thread has to run 
                     A1  a1 = new A1(); 
                     B1  b1 = new B1(); 
          
                       // creation of child thread 
                     Thread t1 = new Thread(a1); 
                     Thread t2 = new Thread(b1); 
          
                       // moving child thread to runnable state 
                     t1.start();   // from hier we are creating Second Thread
                     t2.start();   // from hier we are creating Third Thread
  
                   try{ 
                      Test.newBarrier1.await(); 
        
                   }catch (InterruptedException | BrokenBarrierException e) { 
                       e.printStackTrace(); 
                          } 
          
                       // barrier breaks as the number of thread waiting for the barrier 
                        // at this point = 3 
                      System.out.println("Sum of product and sum = " + ( A1.product +  B1.sum)); 
                  
                        // Resetting the newBarrier 
                             newBarrier1.reset(); 
                        System.out.println("Barrier reset successful"); 
                     } 
                    // .run() method ends hier
} 
/*https://www.geeksforgeeks.org/java-util-concurrent-cyclicbarrier-java/     hier we get this code

 CyclicBarrier.getParties();
 CyclicBarrier.await();
 CyclicBarrier.reset();

 these 3 methods we use in this code
 in the D: drive i save a text file with the documentaion of this code

*/