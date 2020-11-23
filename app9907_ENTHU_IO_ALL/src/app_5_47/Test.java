package app_5_47;

import java.io.Console;

public class Test {

	public static void main(String[] args) {

		Console c = System.console();
		
		char[] ch1 = c.readPassword(" Please enter password");
		
		 String pwd = new String (ch1);
		 
		 System.out.println(pwd);
		
		
	}

}
