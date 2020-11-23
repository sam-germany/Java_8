package app_4_80;

import java.io.File;

public class Test {

	public static void main(String[] args) {

		File f = new File("C:\\a\\b\\c\\d\\e");
	
	  
		System.out.println(f.getParent());
		
		System.out.println(f.getParentFile());
	
	
	}

}
