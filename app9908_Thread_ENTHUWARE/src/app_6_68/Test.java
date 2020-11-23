package app_6_68;

public class Test extends Thread{

	
	
	 public  void m1() {
		 
                      		 try {
		                     	 Thread.sleep(10000);
		                       System.out.println("----");
	                        	 }catch(Exception e){}
	                                  }
	 
	 public  void m2() {
                       		 try {
         	                     Thread.sleep(10000);
                               System.out.println("----");
        	                     }catch(Exception e){}
                                      }   

	
	 @Override
	public void run() {  //point:  first i tried to put the both  m1(), m2() complete code in the run() method
            m1();         // but we are not alloweed to put these complete code inside .run() method
            m2();         // but we are alloweed to call like this these method. this is alloweed
	 
	 }
	 
	 public static void main(String[] args) {

		new Test().start();
		new Test().start();

/*
 the main point is
 
 
 */
		
	}

}
