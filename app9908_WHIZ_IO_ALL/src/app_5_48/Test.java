package app_5_48;

import java.io.IOException;
import java.io.InputStream;

public class Test {

	public static void main(String[] args) throws IOException {

		byte[] b  = new byte[10];
		
		InputStream in = System.in;
		
		
		int i = in.read(b);
		
		for( byte c : b) {
			System.out.println((char)c);
			
		}
		in.close();
		
		
	}

}
