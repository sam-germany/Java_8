package a1;

public class Test {

	public static void main(String[] args) {

		int a = 0;
		int b = 1;
		int c;        // as we are not doing any arithmetic operation on  " int c" so we do not
	                                      // need to initalize it, normally it looks that we must
		for(int i=0; i<10; i++) {          // initalize it but as we are just storing a value to it
                                          // so we do not need to initalize it.
			   c = a+b;
		      System.out.println(b);
		       a = b;
		       b = c;
		
		}
		
		
		
		
	}

}
