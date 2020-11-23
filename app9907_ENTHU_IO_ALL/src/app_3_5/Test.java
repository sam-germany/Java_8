package app_3_5;

import java.io.BufferedReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test {

	public static void main(String[] args) {

		Path  p1 = Paths.get("D:\\Extra_Space_For_FOS\\qqq.TXT");
		
		try(BufferedReader bfr = Files.newBufferedReader(p1, Charset.forName("US-ASCII"))){
			
			String line = null;
			
			while( (line = bfr.readLine()) != null) {
				System.out.println(line);
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
