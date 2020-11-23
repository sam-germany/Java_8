package app_3_14;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Test {


    
    public static void copy1(Path p1, Path p2) throws Exception {
        Files.copy(p1, p2, StandardCopyOption.COPY_ATTRIBUTES, StandardCopyOption.REPLACE_EXISTING);
    }
    
    
    public static void main(String[] args) throws Exception {
        Path p1 = Paths.get("D:\\Extra_Space_For_FOS\\q22.txt");
        Path p2  = Paths.get("D:\\Extra_Space_For_FOS\\q33.txt"); //  a new file will be created with the name  of 
                                                              // q33.txt  and the content of q22.txt will be copied to q33.txt
                                                             // if q33.txt   is already existed the this time it will overrite it
        copy1(p1, p2);
        
        
        if(Files.isSameFile(p1, p2)){
            System.out.println("file copied");
        }else{
            System.out.println("unable to copy file");
        }
    }
}