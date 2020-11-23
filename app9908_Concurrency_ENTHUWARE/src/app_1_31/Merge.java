package app_1_31;

import java.util.concurrent.CyclicBarrier;

class ItemProcessor extends Thread{

	CyclicBarrier cb;
	
	public ItemProcessor(CyclicBarrier cb) {
		this.cb = cb;
	}
	
	public void run() {
           System.out.println("processed");
		
           try {
			cb.await();
		}catch(Exception ex) {
			ex.printStackTrace();
		}
           
	}}
public class Merge  implements Runnable{

	@Override
	public void run() {

		System.out.println("Value Merged");
	}
	public static void main(String[] args)  throws Exception{

		Merge m = new Merge();
		CyclicBarrier cb = new CyclicBarrier(2,m);   // their are 2 types constructor  for CyclicBarrier see in copy
		
		ItemProcessor ip = new ItemProcessor(cb);
		ip.start();   // it is very trickey question , .start()  we are creating 2 objects  Merge, ItemProcessor
		cb.await();   //   and with this CyclicBarrier we are creating  the 2 Threads for these 2 class objects
	}                 //  and after that with  ip.start();   we call the run() method  defined in these 2 classes
	                  //  as we defined   cb.await(); method 2 times , so when these 2 threads reach together
	                 //  till   .await() method   after that the execution will be completed.

}/*
    Constructor defined in the CyclicBarrier class
  (1)  CyclicBarrier(int parties)
  (2)  CyclicBarrier(int parties, Runnable barrierAction);
    
     as we extend Merge implements Runnable  so  this is the reason we put in the constructor of the
      CyclicBarrier in this code. and  the other class  ItemProcessor extends Thread   as we use .start();
      it directly. as their i
      

*/
