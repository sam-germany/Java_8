package app_09;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Test {

	public String m1(Path p) {
		
		return   p.subpath(2, 3)
				  .getName(0)
				  .toAbsolutePath()
	              .toString();
	
	}              
	public static void main(String[] args) {

		final Test t  = new Test();
	
		System.out.println(   t.m1(Paths.get("D:\\Extra_Space_For_FOS\\A\\B"))    );
		
		
	}

}
// read explanation as we are putting hier the correct PATH  so now hier no exception will be thrown