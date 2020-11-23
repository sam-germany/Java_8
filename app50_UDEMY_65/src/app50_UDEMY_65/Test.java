package app50_UDEMY_65;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test {

	public static void main(String[] args) throws IOException {
		

		Path src = Paths.get("D:\\Extra_Space_For_FOS\\A\\B\\C\\Book.txt");
        Path tgt = Paths.get("D:\\Extra_Space_For_FOS\\A\\C");
        Files.copy(src, tgt);
        
    }
}