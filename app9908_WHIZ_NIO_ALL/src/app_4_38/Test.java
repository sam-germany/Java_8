package app_4_38;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test {

	public static void main(String[] args) throws IOException {

		Path p = Paths.get("D:\\Extra_Space_For_FOS_2\\rr\\ss.txt");
		
		File myfile = new File(p.toString());
		
	System.out.println(	myfile.createNewFile() );
	}

}

//  .createNewFile()  throws IOException    method return true when new file is created

// .createNewFile() method return false , when this defined file already exist, of becuase of any reason
//                   new file is not created