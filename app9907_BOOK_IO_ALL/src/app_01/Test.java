package app_01;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class Smoke{
	
	public void sendAlert(File fn1)  throws IOException{
	
	try(BufferedWriter bw = new BufferedWriter(new FileWriter(fn1)))
	{
	   	bw.write("Alert");      // this will be written on  File
	   	bw.flush();
	   	bw.write('!');             // this will be written on  File
	   	System.out.println(1);     // this will be display on console
  	}catch(IOException e) {
  		System.out.println("2");    
  	}finally {
  		System.out.println("3");      // this will be display on console
  	}
	}
}
public class Test {
	public static void main(String[] args) throws IOException {

		new Smoke().sendAlert(new File("D:\\Extra_Space_For_FOS_2\\cc1"));
		
	}

}
