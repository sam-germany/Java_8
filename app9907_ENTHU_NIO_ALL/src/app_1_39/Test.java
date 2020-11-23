package app_1_39;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Test {

	public static void main(String[] args) {


      Path p1 = Paths.get("c:\\..\\temp\\test.txt");
      
      System.out.println(p1.normalize());
      
      System.out.println(p1.normalize().toUri());
      

	}

}
