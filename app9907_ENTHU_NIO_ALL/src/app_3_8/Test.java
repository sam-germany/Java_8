package app_3_8;

import java.io.FileWriter;
import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException {

		FileWriter fw = new FileWriter("D:\\Extra_Space_For_FOS\\qqqq.TXT");
		
		
		fw.write("hello");
		
		fw.close();
		
		
	}

}
