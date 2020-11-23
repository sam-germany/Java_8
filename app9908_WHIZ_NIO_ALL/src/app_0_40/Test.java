package app_0_40;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.StandardCopyOption.*;

public class Test {

	public static void main(String[] args) throws IOException {

		Path p1  = Paths.get("F:\\Whizlabs\\java\\nio\\myfile.txt");
		
		Path p2 = Paths.get("..\\myfile.txt");
		
		Files.copy(p1,p2, REPLACE_EXISTING);
		
		System.out.println(p2);
		
		
	}

}
/*
import static java.nio.file.StandardCopyOption.*;


 as we are directly using  REPLACE_EXISTING  attribute so we must write this import
 then only we can use this attribute directly otherwise error will be shown
 
 
*/