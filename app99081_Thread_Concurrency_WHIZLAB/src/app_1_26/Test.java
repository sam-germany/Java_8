package app_1_26;

class A implements Runnable{
	

	   @Override
	public void run() {
          
		   try {
			      for(String x: new String[] {"..aaaa..","..bbb.."}) {
			    	  System.out.println(x);
			    	  Thread.currentThread().sleep(1000);
			                }
	
		      }catch(InterruptedException e) {}

		   System.out.println("Go....");
	}}
public class Test {
	public static void main(String[] args) {

		A  a = new A();
		Thread t = new Thread(a);
		
		t.start();
		
		
	}

}
