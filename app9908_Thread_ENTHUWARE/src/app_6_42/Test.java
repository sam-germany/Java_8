package app_6_42;

public class Test extends Thread{
	
	String msg = "defualt";
	
	public Test(String s) {
		msg= s;
	}

	@Override
	public void run() {
        System.out.println(msg);
	}
	
	public static void main(String[] args) {

		new Test("String-1").start();
		new Test("String-2").start();
		
		System.out.println("end");
		
		
		
		
	}

}
