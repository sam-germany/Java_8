package app_3_48;

public class Test extends Thread {

	static Object obj1 = new Object();
	static Object obj2 = new Object();
	
	public void m1() {
		synchronized(obj1){
			 System.out.println("1 ");
			    synchronized(obj2){
			    	System.out.println("2 ");
			    }}}
	
	
   public void m2() {
	   synchronized(obj2) {
		   System.out.println("3 ");
              synchronized(obj1) {
            	  System.out.println("4 ");
              }}}
   
       @Override
     public void run() {
       	m1();
      	m2();
     }
    public static void main(String[] args) {

    	new Test().start();
    	new Test().start();     // remember that these 2 Threads will call .run() method 2 times
		                         // so it means 2-2 times m1(), m2() method will be called and 
    	                         // obj1, obj2    both will be called 4-4 times
		
		
		
		
		
		
	}

}
