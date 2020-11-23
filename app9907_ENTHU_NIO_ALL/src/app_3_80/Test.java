package app_3_80;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test {

	public static void main(String[] args) throws IOException {

		Path p1  = Paths.get("D:\\Extra_Space_For_FOS_2\\qqq.TXT");
		
		Path p2 =  p1.resolveSibling("qqq2.TXT");
		System.out.println(p2);
		
		Path p3  = p1.resolve("qqq2.TXT");
		System.out.println(p3);
		
		
		BufferedWriter bw = new BufferedWriter(new FileWriter(p2.toFile()));
		
		bw.write("hello111");
        bw.close();		
        
        
        System.out.println("-----------------------");

        
        BufferedReader br = new BufferedReader(new FileReader(p2.toFile()));
        
        while(br.ready()) {
        	System.out.println(br.readLine());
        }
        
        
       
// Must read all the options in question
        
	}

}
