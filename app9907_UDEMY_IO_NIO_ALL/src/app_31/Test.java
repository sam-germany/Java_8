package app_31;

import java.io.File;
import java.io.IOException;

public class Test {
	
	
	public static void main(String[] args) throws IOException {
        deleteFiles1(new File("D:\\Extra_Space_For_FOS\\delete"), ".pdf");
    }
 
    public static void deleteFiles1(File dir, String ext) throws IOException {
    	
        File[] list = dir.listFiles();   // this method() return a  [] Arrays included files
      
         System.out.println(list.length);
        
         if (list != null && list.length > 0) {   //  list.length as per question it return 4 (2 folders and 2 files)
              
                 	      for (File file : list) {
                
                            	if (file.isDirectory()) {
                                   deleteFiles1(file, ext);
                               
                            	} else if (file.getName().endsWith(ext)) {
                                   file.delete();
                                }}
                      }
    }
}