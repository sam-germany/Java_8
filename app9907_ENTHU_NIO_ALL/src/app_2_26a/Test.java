package app_2_26a;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Test {

	public static void main(String[] args) {

		byte [] b = {'d','c','s','f','g','t'};
		
		try {
			OutputStream os  = new FileOutputStream("D:\\Extra_Space_For_FOS\\a.TXT");
			
			InputStream is = new FileInputStream("D:\\Extra_Space_For_FOS\\b.TXT");

			
			os.write(b, 0 ,5);
			
			for ( int i = 0; i< 5;i++ ) {
				System.out.println(" " + (char)is.read());
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
