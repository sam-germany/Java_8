package app_25;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {

	public static void main(String[] args)  throws IOException{

		try(FileInputStream fis= new FileInputStream("D:\\Extra_Space_For_FOS\\a.txt");
		    FileOutputStream fos = new FileOutputStream("D:\\Extra_Space_For_FOS\\a12.txt"))
		   {
		
		   int res= 0;
				
				byte[] arr = new byte[500000];
				
				while( (res= fis.read(arr)) != -1) {
					
					fos.write(arr, 0,res);
				}
				
		   }
	}

}
