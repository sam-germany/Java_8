package app_49;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Test1 {

	public static void main(String[] args) throws IOException {

        Path src = Paths.get("D:\\Extra_Space_For_FOS\\X\\Y\\Z");   // Z folder has Book1.txt
        Path tgt = Paths.get("D:\\Extra_Space_For_FOS\\Z");
       
        Files.move(src, tgt, StandardCopyOption.REPLACE_EXISTING);
        
       
        
 //  in this case also as same as last the  src  Z folder will be deleted and only the file Book1.txt
  // will be moved from   src to tgt
        
        
    }
}