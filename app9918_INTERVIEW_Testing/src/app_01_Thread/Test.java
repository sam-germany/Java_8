package app_01_Thread;

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
           m1();         // code in the run() method but we are not alloweed to put these.run() method
           m2();         // complete code inside  but we are alloweed to call like this these method.
	 }                                                     // this is alloweed
	 public static void main(String[] args) {
		new Test().start();
		new Test().start();
		
	 }}		