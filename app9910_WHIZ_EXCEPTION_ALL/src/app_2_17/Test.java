package app_2_17;

public class Test {

	public void meth1() {
		for(int x=0;x<5;x++) {
			int y = (int)5/x;
			System.out.println(x);
		}
	}
	
	public static void main(String[] args) {

		try {
			throw new ArithmeticException();
		}catch(Exception e) {
			System.out.println("Exception 1");
		
		}finally {
			
		      	try {
			    	new Test().meth1();
		        	
		      	}catch(Exception e) {
			    
		      		System.out.println("Exception 2");
			}
		}
		
	}

}
