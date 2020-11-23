package app_27;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;

public class Test {

	public static void main(String[] args)  throws Exception{

		
		Writer w = new FileWriter("D:\\Extra_Space_For_FOS_2\\abc1.txt");
		
		try(BufferedWriter bw = new BufferedWriter(w))
		{
			bw.write("Hello write this String on file");  // Note:    after this the } bracket close for  try block
		}finally {                                        // it means we use Try( with resources)  before the bracket
			w.flush();                                   // closed  the .close() method will be executed and it  will
			w.close();                                  // automatically close all the open resources.
			                                             // .flush() method will thorw error as we use on closed 
		}                                              // resouce, but  we are alloweed to call .close() on closed
		System.out.println("Done----");                                                            //  resource
	}

}
