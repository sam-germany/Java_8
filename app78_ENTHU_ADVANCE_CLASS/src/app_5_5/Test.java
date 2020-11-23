package app_5_5;



public class Test{

	class Runner22 implements Runnable{
		
		public void run() {

			Thread [] t = new Thread[5];
			
			for(int i=0; i<t.length;i++) {
				System.out.println(t[i]);
			}
		}
	}
	public static void main(String[] args) {
	
       Test t = new Test();
       new Thread(t.new Runner22()).start();

		
		
	}


}
