package app_01;

import java.io.IOException;
import java.io.PrintStream;

public class Test {

	public static void main(String[] args)  throws IOException{

		  System.setOut(new PrintStream("D:\\Extra_Space_For_FOS_2\\err111.log"));   
		                                                   // new PrintStrem() throws FileNotFound  it is a checked
	                                                       // execption 
 
	 	     try {
    			    System.out.println("One---");
	    		     System.out.println( 1 / 0);
		      } catch (ArithmeticException e) {
		    	  System.out.println("Teolll");      // this will be added to file
		              System.err.print("Two");       // this will be printed on console
		      }
		  
		  
		  // as we defined a path for the err111.log file we can check the new file is created 
		  
		  
	}
		  
}
