package app_6_81;

public class Test  implements Runnable{

      Test(String name){
    	  new Thread(this, name).start();
      }
	
      
      @Override
    public void run() {

    	  System.out.println(Thread.currentThread().getName());
    }
	
	public static void main(String[] args) {

		Thread.currentThread().setName("First...");
		
		 Test t = new Test("My Runnable");
		 t.run();
		 
		 
		 Thread.currentThread().setName("Second");
		  t.run();
		 
	}

}
