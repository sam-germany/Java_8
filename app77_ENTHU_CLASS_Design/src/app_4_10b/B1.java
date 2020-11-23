package app_4_10b;

import app_4_10a.A1;

public class B1 extends A1 {

	public void process(A1 a) {
//		a.i = a.i*2;               as int i    is protected int  class A1  so it is 
	}                       //    not visible like this in class B1   only through       
	                       //    inheritance it is avilable
	
	
	public static void main(String[] args) {
		
		A1 a1 = new B1();
//		System.out.println(a1.i); // compilation error
 		
		A1 a2 = new A1();
//		System.out.println(a2.i);  // compilation error
		
		
		B1 b1 = new B1();
		System.out.println(b1.i);
	
	
	}
}
