package app_4_60;

import java.io.IOException;

class Device implements AutoCloseable{
	String header = null;
	
	public void open1() {
		header  = "Opened";
		System.out.println("Device Opened");
	}
	
	public String read1() throws IOException{
		throw new IOException("Unknown");
	}
	
	public void writeHeader(String str) throws IOException{
		System.out.println("writing : "+ str);
		header = str;
	}
	
	@Override
	public void close() {
             header = null;
             System.out.println("Device closed");
	}
      
	public static void testDevice(){
		try(Device d = new Device()){
			d.open1();
			d.writeHeader("TEST");
			d.close();
		}catch(Exception e) {
			System.out.println("GOT EXCEption ");
		}
	}
}

public class Test {

	public static void main(String[] args) {

		Device.testDevice();
		
		
	}

}
