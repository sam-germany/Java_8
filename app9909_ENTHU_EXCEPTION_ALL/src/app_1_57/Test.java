package app_1_57;

import java.io.IOException;

public class Test implements AutoCloseable{
	
	
	String header = null;
	
	public Test(String name) throws IOException{
		header  = name;
		
	   if("D2".equals(name)) throw new IOException("Unknown");
	   
	   System.out.println( header + " Opened");
	}

	public String read() throws IOException{
		return "";
	}

	@Override
	public void close() throws Exception {
    System.out.println("Closing device "+  header);		
	
	throw new RuntimeException(" RTE while closing "+ header);
	}
	public static void main(String[] args) throws Exception {

		try(  Test d1 = new Test("D2"); Test d2 = new Test("D1")  ){
			throw new Exception("test");
		}
		
	}





}
