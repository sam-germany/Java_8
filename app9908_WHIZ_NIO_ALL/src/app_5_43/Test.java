package app_5_43;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {

		try (Stream s = Files.walk(Paths.get("D:\\Extra_Space_For_FOS_2\\rr"), 3)){
			
			System.out.println(s.count());
		
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
