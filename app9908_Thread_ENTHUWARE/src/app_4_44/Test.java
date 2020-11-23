package app_4_44;

public class Test extends Thread{
	
	static int x;
	static int y;
	
	public synchronized void run() {
		
		 for(;;) {
		         x++;
		         y++;
	System.out.println(x +"  "+y);
		}
	}
	public static void main(String[] args) {

		new Test().start();
		new Test().start();
		
		
		
	}

}

// read explantaion of all the points then only i can understand this question  and draw in mind

// the main point hier is about printing, as we have 2 different object these objects will be incrementing
// x++ , y++  but  as both the threads are printing together this printing order we can not control they
// can print in any order.