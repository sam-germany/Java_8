package app_2_45;

public class Test extends Thread{

	static Object obj = new Object();
	
	static int x;
	static int y;
	
	@Override
	public void run() {
      
		  synchronized(obj) {
			      for(;;) {
			    	  x++;
			    	  y++;
			    	  System.out.println(x +" "+y);
			      
			      }}}
	public static void main(String[] args) {

		new Test().start();
		new Test().start();
		
		
		
	}

}
// Read Explanation