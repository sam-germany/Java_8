package app_2_65;

import java.io.IOException;

public class Test   implements AutoCloseable{

	String header = null;
	
	public void open1() {
		header = "OPENED";
		
		System.out.println("DEVICE OPENED");
	}
	
	public String read1() throws IOException{
		System.out.println("Read method");
		
		throw new IOException("Unknown");
	}
	
	public void writeHeader1(String str) throws IOException{
		System.out.println("writing : "+ str);
		header = str;
	}
	
	@Override
  	public void close() {
	 header  = null;
	 
	 System.out.println("Device closed");
	 
	}

	public static void testDevice() {
		try(Test d = new Test()){
			d.open1();
			d.read1();
			d.writeHeader1("Test");
			d.close();
		}catch(IOException e) {
			System.out.println("Got Exception");
		
		}
	}
	
	public static void main(String[] args) {

		Test.testDevice();
	}


}
