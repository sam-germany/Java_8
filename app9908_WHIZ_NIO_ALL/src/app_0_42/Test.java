package app_0_42;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test {

	public static void main(String[] args) throws Exception {

		FileInputStream in = null;
		FileOutputStream out = null;

	
		try {
			in = new FileInputStream("D:\\Extra_Space_For_FOS_2\\rr\\1a.TXT");
			out = new FileOutputStream("D:\\Extra_Space_For_FOS_2\\rr\\2a.TXT");
			
			int c;
			
			while((c = in.read()) != -1) {
				out.write(c);
			}
			
		}finally {
			if(in != null) {
				in.close();
			}
			
			if(out != null) {
				out.close();
			}
			
		}
	
	}

}
