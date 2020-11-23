package app_2_45;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributes;
import java.nio.file.attribute.PosixFileAttributes;

public class Test {

	public static void main(String[] args)  throws IOException{
		
		Path p = Paths.get("D:\\Extra_Space_For_FOS_2\\rr\\1a.TXT");
		

		DosFileAttributes  attr1 = Files.readAttributes( p , DosFileAttributes.class);
		System.out.println(attr1.lastModifiedTime());

		
		
	}

}
