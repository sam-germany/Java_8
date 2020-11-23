package app_1_3;

public class Test  implements Runnable{

	volatile int  x;
	
	@Override
	public void run() {
                 x = 5;                //  this  x = 5  will not be reflected back
             System.out.println(x);
	}
	public static void main(String[] args) {

       Test t  = new Test();
         t.x  = 10;
       
       new Thread( t ).start();
		
       System.out.println(t.x);
	}

	

}
