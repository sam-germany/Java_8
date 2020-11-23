package app_22;

import java.io.File;

public class Test {

	public static void main(String[] args) {

	File f1 = new File("D:" + File.separator + "A1" + File.separator + "B1" );
	
//	f1.mkdirs();  // just for understanding if we execute with this method it like this then we are
	              // going to create 2 folder one is  A1 and inside  A1 we create B1 folder

	
	    f1.getParentFile().getParentFile();
	    
	    f1.getParentFile().getParent();
	    
	
	    //   f1.getParent().getParentFile();       after .getParent();  method we can not call anything
	    
	    // f1.getParent().getParent();   like this we can not call it wil give us compilation error
	
	
	
	}

}
