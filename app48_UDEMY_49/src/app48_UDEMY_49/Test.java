package app48_UDEMY_49;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Test {

	public static void main(String[] args) throws IOException {

        Path src = Paths.get("D:\\Extra_Space_For_FOS\\X\\Y\\Z");
        Path tgt = Paths.get("D:\\Extra_Space_For_FOS\\t");
       
        Files.move(src, tgt, StandardCopyOption.REPLACE_EXISTING);
    }
}