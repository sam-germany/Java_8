package app_2_26_imp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Test {

	
	 public static void copy1( File file1, File file2) throws Exception{
		 
		 try( InputStream is = new FileInputStream(file1);     // we must have already created fileName1 otherwise exception
			  OutputStream os = new FileOutputStream(file2);   ){ // if file is not created till now then 
			                                                         // FileOutputStream will create a new File
			 byte[] buffer = new byte[5];                           
			 
			 int bytesRead = 0;
			 while( (bytesRead = is.read(buffer)) != -1 ) {  
				 
				 System.out.println("--- "+ bytesRead);
				 
				  os.write(buffer, 0, bytesRead);
				  
				  System.out.println("===="+ bytesRead);
			 }
		 }
	 }
	public static void main(String[] args) throws Exception{

       Test t = new Test();
       
       File file1 = new File("D:\\Extra_Space_For_FOS_2\\uu1.txt");
       File file2 = new File("D:\\Extra_Space_For_FOS_2\\uu2.txt");
       
       t.copy1(file1, file2);

/* 1) easy to understand, in file uu1.txt  we have 9 char of data,	 we have a byte[] buffer = it takes 5 char
  at one time  when  while() loop start executing  then  is.read(buffer)    then in one time .read() method take 5 char from
  file1  and put them in buffer. 
 2) now buffer has 5 char , as buffer has 5 char then  != -1  return true as it is not equal to -1
 3) as buffer has 5 char then    int bytesRead =5   get a value of 5  also

 4)  os.write(buffer, 0, bytesRead);    it means   os.write(5 char,  start  from 0th index , end total length is 5)  
    it means write    the char avilable in the  buffer on file2   for writing start from oth index and total length
    that should be written is 5
 5)  as buffer is type of  byte[]   so  while using .write() method we use  index  from oth   and length of 5 char   
      
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
*/	
	
	}}












