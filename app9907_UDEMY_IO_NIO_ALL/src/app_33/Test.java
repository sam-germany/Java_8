package app_33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {

	public static void main(String[] args) throws FileNotFoundException, IOException {

        try(InputStreamReader r = new InputStreamReader(new FileInputStream("D:\\Extra_Space_For_FOS\\a.txt")) )
		   {
		 while(r.ready()) {
			 r.skip(1);
			 r.skip(1);
			 System.out.println(  (char)r.read() );
		 }
		
		   
		   }
	}

}
// Note:  this is a while() loop so every time first 2 char will be skipped and 3rd will be printed