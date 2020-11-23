package app_03;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Test {


	public void m1 (Path p) throws Exception{
	 
		if(Files.isHidden(p)) {                
	 		System.out.println("Foundedd---");
		}else {
			System.out.println("not a hidden file");
		}
	}
	
	
	
	
	public static void main(String[] args) throws Exception {

		final Test t = new Test();
		      t.m1(Paths.get("D:\\Extra_Space_For_FOS\\alarm.txt"));
	}

}
