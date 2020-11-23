package app_1_43;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Test {

	public static void main(String[] args) throws IOException {

		int i ;
		
		
		InputStream in = System.in;

     	BufferedReader br = new BufferedReader(new InputStreamReader(in));

     	try {
     		
     		 i = br.read();
     		 System.out.println("ASCII value of "+(char)i+"  is  "+i);
     		 
     		 
     		
     	}catch (IOException e) {
                System.out.println(e);
     	}finally {
			br.close();
		}
	
	}

}
// just enter any character on the console, as  InputStream take ACII values  so we can also
// convert those ASCII values, hier clearly showing this 