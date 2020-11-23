package app_14;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {

	public static void main(String[] args) throws  IOException {

		File    f1  = new File("D:\\Extra_Space_For_FOS_2\\udemy11.dat");
		
		
try( DataOutputStream os  = new DataOutputStream(new FileOutputStream(f1));
	 DataInputStream  is  = new DataInputStream(new FileInputStream(f1))  			
                           			                                   ){
			                                                     os.writeChars("Java");
			                                                 System.out.println(is.readChar());
		}
		
		
	}

}
// hier we are wraping   FileOutputStream into DataOutputStream()