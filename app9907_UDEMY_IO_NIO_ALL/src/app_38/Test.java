package app_38;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Test {

	public static void main(String[] args) {

		Path file1 = Paths.get("F:\\A\\B");            
        Path file2 = Paths.get("F:\\A\\B\\C\\Book.java");
        
        
        System.out.println(file1.resolve(file2));
        
        System.out.println(file1.resolveSibling(file2));
        
        
        
        System.out.println(file1.resolve(file2).equals(file1.resolveSibling(file2)));

	}

}
