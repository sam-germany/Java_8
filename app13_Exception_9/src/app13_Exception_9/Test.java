package app13_Exception_9;

import java.io.IOException;

public class Test {

	public void turnOn() throws IOException{
		throw new IOException("Hiiiii");
	}
	
	public static void main(String[] args) throws Exception {

		try {
		 new Test().turnOn();	
		} catch (Exception e) {
               System.out.println(" ff");
		throw new IOException();
		}finally {
			System.out.println("Completed");
		}
		
		
		
	}

}
