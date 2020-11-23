package app_2_43;

public class Test extends Thread{

	String id="";
	
	public Test(String s) {
		this.id= s;
	}
	
	@Override
	public void run() {
		   System.out.println(id);;
	}
	
	public static void main(String[] args) {

		Thread t1 = new Test("AAA..111");
		t1.setPriority(Thread.MIN_PRIORITY);

		Thread t2  = new Test("BBB..111");
		t2.setPriority(Thread.MAX_PRIORITY);
		
		t1.start();
		t2.start();
		
		
		
		
	}
}
