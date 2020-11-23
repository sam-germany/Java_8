package app_60;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test {

	public static void main(String[] args) throws IOException {
		
        Path path = Paths.get("D:\\symbolic_link_shortcut");
        
        
        try (BufferedReader reader = Files.newBufferedReader(path)) {
        	
            String str = null;
        
            while ((str = reader.readLine()) != null) {
                System.out.println(str);
            
            }
        }
    }
}