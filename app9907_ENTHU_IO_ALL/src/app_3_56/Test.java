package app_3_56;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidClassException;
import java.io.OutputStream;

public class Test {
	
	public static void copy11 (String records1, String records2) throws IOException{
	
		try {
			InputStream ins = new FileInputStream(records1);
		    OutputStream ops = new FileOutputStream(records2);	
		    
		    byte[] buffer = new byte[1024];
		    int bytesRead= 0;
		    
		    while( (bytesRead = ins.read(buffer)) != -1) {
		    
		      ops.write(buffer, 0 , bytesRead);
		    }
			
			
		}catch (FileNotFoundException | InvalidClassException e ) {
		        System.out.println(e);
		}
	}
	
	
     public static void main(String[] args)  throws Exception{
	 
    	copy11("D:\\Extra_Space_For_FOS\\qqq.TXT", "D:\\Extra_Space_For_FOS\\q22.TXT");
    	 
    	 
}
}
