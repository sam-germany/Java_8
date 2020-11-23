package app_17;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class Test {

	public static void main(String[] args) throws FileNotFoundException{

		         //                     FileWriter() 
		try( PrintWriter pw = new PrintWriter("D:\\Extra_Space_For_FOS_2\\bb1.txt"))
		{
			pw.close();
			pw.write(1);
			
		}catch(IOException e ) {
			System.out.println("IOException-----");
		}
	}

}

// as the  .write() method of  PrintWriter  throws 