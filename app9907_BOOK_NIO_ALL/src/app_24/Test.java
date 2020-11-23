package app_24;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Test {

	public void m1() {
		
		try(OutputStream out = System.out){
                          // ( path , out)
			Files.copy(Paths.get("D:\\Extra_Space_For_FOS\\a.txt"), out);
		 
		}catch(IOException e) {
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) throws Exception {

		new Test().m1();
		
	}

}
