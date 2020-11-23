package app_34;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.FileTime;

public class Test {

	public static void organize(Path folder, Path file) throws Exception{
		
		Path p = folder.resolve(file);
		
		System.out.println(p);
		
		
		
		BasicFileAttributeView vw = Files.getFileAttributeView(p, BasicFileAttributeView.class);

		if(vw.readAttributes().creationTime().toMillis() < System.currentTimeMillis()) {
			
			vw.setTimes(FileTime.fromMillis(System.currentTimeMillis()), null, null);
			
			System.out.println(vw);
		    
		}
	
	}
	
	public static void main(String[] args) throws Exception{

		Test.organize(Paths.get("D:\\Extra_Space_For_FOS\\"), new File(".\\b.txt").toPath());
		
		
		
	}

}
