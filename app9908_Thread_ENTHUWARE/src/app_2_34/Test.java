package app_2_34;

public class Test implements Runnable{

	int n = 0;
	 
	public Test(int n) {
		this.n = n;
	}
	
	@Override
	public void run() {
    
		for(int i=0; i<n; i++) {
			System.out.println("Hello World");
		}
	}
	public static void main(String[] args) {

		new Thread(new Test(2)).start();
		
		new Thread(new Test(1)).start();
	}

}
