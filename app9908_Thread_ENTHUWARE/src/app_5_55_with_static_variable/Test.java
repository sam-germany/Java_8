package app_5_55_with_static_variable;

class A extends Thread{
	
	static protected int i = 0;
	
	@Override
	public void run() {
             
		for(; i<5;i++) {
			System.out.println("A class---  "+ i);
			try {
				Thread.sleep(100);        // 1000 millisecond   = 1 second
			}catch(Exception e){}
}      }}

public class Test extends A{
	
	     @Override
      	 public void run() {
            for(;i<5; i++) {
            	System.out.println("Test class---- "+ i);
            	try {
            		Thread.sleep(100);
            	}catch(Exception e) {}
            }
	     }
	public static void main(String[] args) {

		Thread t1 = new A();
		Thread t2 = new Test();
		
		t1.start();
		t2.start();
		
	}

}
