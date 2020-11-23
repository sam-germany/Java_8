package app56;

public class Test {
private volatile int val = 0;
private int max = 10;
	
	public void playPingPong() {
		new Thread(()->  {     // Thread-1
			for(int x = val; x < max;)
		
				if(x != val) {
					System.out.println(("pong---" + val + "  "));
					x= val;
				             }
			
		}).start();
		
		new Thread(()-> {     //  Thread-2    just comment this and also read the explanition in the copy of mutlithreading
			for(int x = val; val<max;) {
				val= ++x;
				System.out.println("ping "+ x + " ");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();
		
		
		
	}
	
	
	
	public static void main(String[] args) {

		
	   Test t = new Test();
	   t.playPingPong();
	}

}
