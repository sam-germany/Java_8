package app_2_36;

class MyTest  implements Runnable{

	MyTest(String name){
		 
		new Thread(this, name).start();
	}
	
	@Override
	public void run() {

		System.out.println(Thread.currentThread().getName());
                 	}	
}

public class Test{
	public static void main(String[] args) {

		Thread.currentThread().setName("Main--Thread");
		
		MyTest  mr = new MyTest("MyRunnable....");
		
		mr.run();                       // this is explicit call to .run()  method from the "main-Thread"
		
	}}

/*
   just draw in mind.
   
    (1) we execute this code, main thread start executing
    (2) we change the name of the main thread to  ("Main--Thread")
    (3) after that this main thread call create  new MyTest(..);   object
    
    (4) after creating object this same  main--Thread  call the constructor of   MyTest class
    (5) point:  now in the constructor of the  MyTest class we have  main-Thread  then  this  main-Thread
       call the  new Thread().start();   and a new Thread is created
    (6) now in the MyTest class  constructor we have  2 Threads, from hier the  main--Thread 
      goes out from the  constructor, and come back to  main method, important is that from the constructor
      "main-Thread"    will not call the  .run() method.
    (7) now in the constructor  a new Thread is created with name  "MyRunnable..."  this new Thread will 
       call internall  .run(); method and  "MyRunnable.." is printed on the consile
    (8)  after coming out from constructor the main-Thread will directy come back to main method
    without calling the .run() method,
    (9) now in the  main method we have again    mr.run();   this explicit call so this is the reason we
    get in the output also   "Main--Thread"
    
    in output we will get    both  "Main--Thread"  and "MyRunnable...." as output but order can be any  
      
       
  
  
  
  
 

*/