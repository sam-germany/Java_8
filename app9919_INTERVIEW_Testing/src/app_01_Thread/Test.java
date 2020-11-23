package app_01_Thread;

public class Test extends Thread{

	      public void m1() {
              		try {
              			System.out.println("-----------");
		          Thread.sleep(1000);
		             }catch (Exception e) {}
              	      }

	      
	      public void m2() {
	    	  try {
	    		  System.out.println("=============");
				Thread.sleep(1000);
			} catch (Exception e) {}
                   	      }
	
	      @Override
	    public void run() {
	         m1();
	         m2();
	    }
	public static void main(String[] args) {

		new Test().start();
		new Test().start();
		
	}

}
