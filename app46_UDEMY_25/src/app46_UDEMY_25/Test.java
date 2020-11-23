package app46_UDEMY_25;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {

	 public static void main(String[] args) throws IOException {
	        try (FileInputStream fis = new FileInputStream("D:\\Extra_Space_For_FOS\\qq.TXT");
	             FileOutputStream fos = new FileOutputStream("D:\\Extra_Space_For_FOS\\q1.TXT")) {
	           
	        	
	          /*  
	        	byte [] arr = new byte[500000]; 
	          
	        	while((fis.read(arr)) != -1){
	            	fos.write(arr);
	            }
	            */
	        	
	        	int res;
	        	byte [] arr = new byte[500000]; 
		          
	        	while((res  = fis.read(arr)) != -1){
	            
	        		System.out.println("--");
	        		System.out.println(res );
	        		
	        		fos.write(arr,0,res);
	        	
	        	}
	        }
	    }
	}