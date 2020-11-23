package app_2_84;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;

public class Test {

	public static void createFile1(String name) throws Exception{
		
		try(OutputStream os = new FileOutputStream(name))
		{
		
			PrintWriter pw = new PrintWriter(os);
			pw.write(1);
		}
	}
	
	
	public static void main(String[] args) {

		
		
		
	}

}
