package app_6_11a;

import java.io.File;

public class Test {

	public static void main(String[] args) {

		File dir = new File("D:\\Extra_Space_For_FOS_2\\kk");
		
		if(!dir.isDirectory()) {
                   			System.out.println( " is not a directory");
		                       }

		File [] files = dir.listFiles();
		
		for(File oldfile: files) {
			
    	if( oldfile.isFile() ){               //  hier i make change the if() statement
	
    		    String oldfilename = oldfile.getName();
				
				System.out.println(oldfilename);
				
				File newfile = new File("D:\\Extra_Space_For_FOS_2\\kk\\" + oldfilename +  ".change1");
				
				boolean b = oldfile.renameTo(newfile);
			
				System.out.println(b+"---");
				
				if(b)
					System.out.println("changed  "+ oldfilename+ "  To   "+ newfile.getName());
				else
					System.out.println("Non changed   "+ oldfilename);
			}
		}
	}
// hier we are changing the name of the files.
}
