package app_1_49;

public class Test implements Runnable{
	
  	int x= 0;
  	int y = 0;
	
	@Override
	public void run() {

		while(true) {
			   synchronized(this) {
				   x++;
				   y++;
				   
				   System.out.println(x + "   "+  y);
			   }
		}
	}

	public static void main(String[] args) {

		Test t  = new Test();
		
		new Thread(t).start();
	
		new Thread(t).start();
		
		
		
	}



}
