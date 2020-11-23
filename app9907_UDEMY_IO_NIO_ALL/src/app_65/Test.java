package app_65;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Test {

	public static void main(String[] args) throws IOException {

		Path src = Paths.get("D:\\Extra_Space_For_FOS\\A3\\B3\\C3\\Book1.txt");
		
		Path tgt = Paths.get("D:\\Extra_Space_For_FOS\\A4\\x12");
		
		Files.copy(src, tgt);
		
		// the main point is to understand that    as for copy we put   \\A4\\x

		// then  in our case   A4 folder must be existed  but their must not be anything
		// with name of   x  their should not be a  x folder or   x file thier then only
		// as per the above given code only  a new file will be created		
		
		
        
		Path src2 = Paths.get("D:\\Extra_Space_For_FOS\\A3\\B3\\C3\\Book1.txt");
		
		Path tgt2 = Paths.get("D:\\Extra_Space_For_FOS\\A5\\t.TXT");
		
		Files.copy(src2, tgt2, StandardCopyOption.REPLACE_EXISTING);  // hier it create a new file , if
		                                                          // t.txt exists then it overwrite it
		
	}

}
