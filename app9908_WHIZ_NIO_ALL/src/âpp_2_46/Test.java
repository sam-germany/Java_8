package âpp_2_46;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test {

	public static void main(String[] args) throws IOException {

		Path p1  = Paths.get("D:\\Extra_Space_For_FOS_2\\rr\\1a.TXT");
		
		Files.setAttribute(p1, "dos:readonly", true );
		
		Files.setAttribute(p1, "dos:readonly", false );
		
	}

}//Nore:  Files.setAttribute()  throws IOException