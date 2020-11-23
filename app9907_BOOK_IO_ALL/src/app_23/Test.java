package app_23;

import java.io.File;

public class Test {

	public static void main(String[] args) {

		File f1 = new File("D:\\Extra_Space_For_FOS_2\\abc1.txt");
		
		System.out.println(f1.getParent());

	    
//		System.out.println(     f1.getParent().getParent() );     this will not compile
	
	}

}
