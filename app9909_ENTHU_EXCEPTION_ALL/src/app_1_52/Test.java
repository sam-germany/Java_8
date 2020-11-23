package app_1_52;

import java.io.IOException;

public class Test  implements AutoCloseable{

	String header = null;
	
	public void open() throws IOException{
		header = "Opened";
		System.out.println("Device opened");
		
		throw new IOException("Unknown");
	}

	public String read() throws IOException{
		return "";
	}
	
	@Override
	public void close() throws Exception {
		
		System.out.println("Closing device");
		header = null;
		
		throw new Exception("rte");
	}
	
	public static void main(String[] args)  throws Exception{

		try( Test d = new Test()){
			throw new RuntimeException("test");
		}
		
	}


}
