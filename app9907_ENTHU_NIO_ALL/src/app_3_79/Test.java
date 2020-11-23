package app_3_79;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) throws Exception{

	   Stream<Path> l5 = Files.list(Paths.get("D:\\Extra_Space_For_FOS_2\\aa"));
	   l5.forEach(x ->System.out.println(x));
	        
		Stream<String> l1 = Files.lines(Paths.get("D:\\Extra_Space_For_FOS_2\\qqq.TXT"));
        l1.forEach(System.out::print);

        System.out.println();
        
        Stream<String> l2 = Files.lines(Paths.get("D:\\Extra_Space_For_FOS_2\\qqq.TXT"), Charset.defaultCharset());
        l2.forEach(s -> System.out.print(s));
        
        System.out.println();
	     
        BufferedReader bfr = new BufferedReader(new FileReader("D:\\Extra_Space_For_FOS_2\\qqq.TXT"));
        
          while (bfr.ready()){
        	System.out.print(bfr.readLine()+" --- ");
        }
      
        System.out.println();
        
        String line1 = null;
        while((line1 = bfr.readLine()) != null) {
        	System.out.print(line1 +" ==== ");
        }
          
        System.out.println();
        
        int line2 = 0;
        while((line2 = bfr.read()) != -1) {
        	System.out.print(line2 +" ##### ");
        }
	
        
	}
}
