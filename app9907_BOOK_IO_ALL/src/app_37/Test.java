package app_37;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class Test {

	
	public void find12() {
		
		try(InputStream is = new ObjectInputStream(readBook1())){
			
			while(is.read() != -1) {
				System.out.println(is.read());
			}
		}catch(Throwable e) {
			throw new RuntimeException(e);
		}
	}
	
	private InputStream readBook1() throws IOException{
		return new BufferedInputStream(new FileInputStream("magic.book"));
	}
	
	public static void main(String[] args) {
         
		new Test().find12();
		
	}

}
