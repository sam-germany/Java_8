package app_1_46;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Test {

	public void dumper(File f) throws IOException{

		FileReader x1 = new FileReader(f);
		
		BufferedReader x2 = new BufferedReader(x1);
		
		String x3 = x2.readLine();
		
		while(x3 != null){
			
			System.out.println(x3);
			
			x3 = x2.readLine();
		}
		

	}
}

// Note: FileReader()   has only .read(); method which read single char at a time, it has no .readLine() method

// BufferedReader()   has a .readLine(); method which read the whole line.