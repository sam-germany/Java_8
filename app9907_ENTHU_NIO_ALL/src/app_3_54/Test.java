package app_3_54;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Test {

	public static void main(String[] args) throws IOException {

		Path p1 = Paths.get("D:\\Extra_Space_For_FOS\\qqq44.TXT");    // Point 1
		Path p2 = Paths.get("D:\\Extra_Space_For_FOS_2\\qqq55.TXT");  //   Hier qqq55.txt must not be existed , if it exist then
	                                                                  // we will get a exception as we do not use REPLACE_EXISTING
		Files.move(p1,  p2, StandardCopyOption.ATOMIC_MOVE);          // attribute, 
		                                                               // in this code new file name qqq55.txt will be created
	                                                                   // and  the content of the  qqq44.txt will be copied
		                                                               // to the qqq55.txt
	//	Files.delete(p1);
		
		System.out.println(p1.toFile().exists() +" "+ p2.toFile().exists());
		          //              false                     true                  //  as the file qqq44.txt is moved then 
//                                                                               p1.toFile().exists()  return false		                                                            
		
	
	
	}

}
// Point 2
// Must read the complete explanation.   as we use   .ATOMIC_MOVE   then if the file already exist  qqq55.txt  then also
// compiler will overwrite it  or it may be the we will get a IOException