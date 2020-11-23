package app_19;

import java.io.File;

public class Test {

	public static void main(String[] args) {

		
		File d1 = new File("D:\\Extra_Space_For_FOS_2\\AA1\\BB1\\CC1");
		
		System.out.println(d1.mkdirs());
		
		
		File d2 = new File("D:\\Extra_Space_For_FOS_2\\AA1");
		
		System.out.println(d2.mkdir());
		
		System.out.println(d2.delete());
		
		
	}

}
