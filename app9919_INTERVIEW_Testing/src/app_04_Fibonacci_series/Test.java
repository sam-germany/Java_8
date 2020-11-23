package app_04_Fibonacci_series;

public class Test {

	public static void main(String[] args) {

		int a = 0;
		int b = 0;
		int c = 1;
		
		for( int i=0;i<10; i++) {

			a = b;
            b = c;
            c = a+b;
        
        System.out.println(a+" ");
			
		
		}}}