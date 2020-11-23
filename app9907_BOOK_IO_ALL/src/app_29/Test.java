package app_29;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Test {

	public void copy12(File s, File t) throws Exception{
		
		try(InputStream is = new  FileInputStream(s);
	                                     		 OutputStream os = new FileOutputStream(t))
		{
			byte[] data1 = new byte[123];
			int chirps;
			
			while(( chirps = is.read(data1)) >0 ) {
				os.write(data1);
			}
		}
	
	
	}
	
	public static void main(String[] args) {

	}

}
