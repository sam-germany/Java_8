package app_3_2;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Test {

	public static void main(String[] args) {


         Path p1 = Paths.get("c:\\temp\\test.txt");
         Path p2 = Paths.get("c:\\temp\\report.pdf");
            
          System.out.println(p1.resolve(p2));

          
          System.out.println("----------------");
          
          Path f1 = Paths.get("c:\\temp\\test.txt");
          Path f2 = Paths.get("c:\\remp11\\report.pdf");
             
           System.out.println(f1.resolve(f2));
           
          
           System.out.println("------------");
          
           Path s1 = Paths.get("c:\\temp\\test.txt");   // absolute path
           Path s2 = Paths.get("temp\\report.pdf");    // relative path
              
            System.out.println(s1.resolve(s2));
            
            
            System.out.println("--------------------");
            
            Path x1 = Paths.get("temp\\test.txt");
            Path x2 = Paths.get("c:\\temp\\report.pdf");
               
             System.out.println(x1.resolve(x2));
          
          
          
          
	}

}
