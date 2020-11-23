package app_13;

import java.io.File;


public class Test {

	public static void main(String[] args) {

		File f = new File("D:\\Extra_Space_For_FOS_2\\A1\\B1");
         f.mkdir();                                              // assume   A1 B1 both we want to create new folder
                                                                 // but if we use f.mkdir()  then it will not 
		                                                        // create any folder as mkdir() create only one folder
         
     //  f.mkdirs();    if we put this then it will create  both new folders:    
	}

}
