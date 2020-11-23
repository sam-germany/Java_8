package app_20;

import java.io.File;

public class Test {
	
       public static void main(String[] args) {
	
	 
    	   
   File f1 = new File("D:\\Extra_Space_For_FOS" + System.getProperty("path.separator") + "A1");
       f1.mkdir();
   System.out.println(f1);
       
       File f2 = new File("D:" + System.getProperty("path.separator") + "A1");
       f2.mkdir();    
       
       System.out.println(f2);
       
       
      // in f1
       
       //Note like this we are not creating a folder name A1    in  D  ->  Extra_Space_For_Fos
       
      // hier like the above code we are creating  directly under D: drive a  new folder 
      // name    Extra_Space_For_FOS;A1     this  is new folder name as we define a name immeaditely
      //                                                                      after D:\\ 
       
       
     // in f2
     //  in D: drive   File f2  =      it will create  a folder    in  D: drive with name  A1 folder 
       
       
       
       
       }
}