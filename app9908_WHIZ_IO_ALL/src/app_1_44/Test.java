package app_1_44;

import java.io.Console;

public class Test {

	public static void main(String[] args) {

		Console con = System.console();
	  
		char[] c = con.readPassword("Enter your password");
		
		for( int x : c) {

		 System.out.write(x);     // see hier i use   .write(int)   method
		 
		 System.out.flush();
		
		}
	
	
	}

}
