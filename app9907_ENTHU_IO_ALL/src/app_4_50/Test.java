package app_4_50;

import java.io.Console;

public class Test {

	public static void main(String[] args) {

		Console c = System.console();
		
		String id  = c.readLine("%s", "Enter Your id");
		System.out.println(id);
		
		char[] pwd = c.readPassword();
		System.out.println(pwd);
		
		
	}

}
