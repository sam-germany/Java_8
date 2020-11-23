package app_0_15;

public class Test {

	public void meth1() throws ArithmeticException{
		
		for(int x=0;x<5;x++) {
			int y = (int)5/x;
			System.out.println(x);
		}
	}
	
	public static void main(String[] args) {

		try {
			
			new Test().meth1();
		}catch(ArithmeticException  e) {
			
			System.out.println("Arithmetic  -----");
		}catch(Exception e) {
			System.out.println("Exception -------");
		}
		
	}

}
