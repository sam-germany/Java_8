package app_49;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Test {

	public static void main(String[] args) throws IOException {

        Path src = Paths.get("D:\\Extra_Space_For_FOS\\X\\Y\\Z");        // Z folder has   Book1.txt
        Path tgt = Paths.get("D:\\Extra_Space_For_FOS\\t");
       
        Files.move(src, tgt, StandardCopyOption.REPLACE_EXISTING);
        
       
        
 //  in this case we have a  file  Book1.txt in the Z  folder, so the move() method 
 // take the fahrest  folder + file which is avilable then move it to the  target
 // but the target must be empty , in our case   Z folder + Book1.txt will be moved from 
 //  src to tgt    folder, But one more point in this case Z folder will be deleted and on the content
 // as Book1.txt will only be moved.
 // as we see in   t   folder  only   Book1.txt is only their no   Z folder is their 
 // Z folder is deleted form src   and also not moved to tgt   it just delete the folder which has the content
        
        
    }
}