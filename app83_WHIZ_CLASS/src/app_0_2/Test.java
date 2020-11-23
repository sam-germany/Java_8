package app_0_2;

public class Test {

	static int y = 1;
	
	public static void main(String[] args) {
           
		abstract class Cal{
			public abstract int c(int x);
		}
		
		Cal c1  = new Cal() {
			                 public int c(int x) {
	                		       	return x-y;
			                             }	
		                     };
		System.out.println(c1.c(2));
	}

}