package app_04_Fibonacci_series;

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
}}}

/*
first Iteration:    a=0  b=1  c=a+b     means   c=0+1    c=1   

after syso()       a=b   b=c   means    a=1  b=1

second iteration      c=2
                 syso(b)  = 1      
                   a=1
                   b=2

third iteration      c=1+2
                  syso(b) = 2
                  a=2
                  b=3
                  
forth iteration      c=2+3
                 syso(b) = 3
                 a=3
                 b=5                     
                  



*/

