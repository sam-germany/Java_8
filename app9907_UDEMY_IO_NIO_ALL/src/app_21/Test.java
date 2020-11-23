package app_21;

import java.io.File;

public class Test {

	public static void main(String[] args) {

		
		File f1 = new File("D:" + File.separator + "A" + File.separator + "B");
		
		System.out.println(f1.getParentFile());   // it shows this method will start checking from 
		                                          //   last folder in our case it is  B
		
		System.out.println(f1.getParentFile().getParent());
	}

}

// as we are not calling   .mkdir() method so these folders are not going to create new
// as per the question these both  A and B  folder already exists in the D: drive 
