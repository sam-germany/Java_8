package app_49;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Test2 {

	public static void main(String[] args) throws IOException {

        Path src = Paths.get("D:\\Extra_Space_For_FOS\\X\\Y\\Z");   // no file is under Z folder
        Path tgt = Paths.get("D:\\Extra_Space_For_FOS\\Y");
       
        Files.move(src, tgt, StandardCopyOption.REPLACE_EXISTING);
        
       
        
 //  in this case no file is under Z, hier also Z folder will be deleted form src , but as no file is thier
 //  so nothing will be  moved
        
    }
}