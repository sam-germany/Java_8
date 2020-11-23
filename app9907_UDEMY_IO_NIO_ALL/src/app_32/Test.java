package app_32;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter any Number between 1 and 10");
		
		int num = br.read();      // .read() method throws IOException
		
		System.out.println(num);
		
	}

}
