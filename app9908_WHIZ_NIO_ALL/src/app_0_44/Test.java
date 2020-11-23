package app_0_44;

import java.io.Console;

public class Test {

	public static void main(String[] args) {

		Console con = System.console();
		
		char[] c  = con.readPassword("Enter the password ");
		
		for(int x : c) {
			
			System.out.write(x);
			System.out.flush();
		}
		
	}

}
