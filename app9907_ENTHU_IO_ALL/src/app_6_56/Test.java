package app_6_56;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class Test {

	public static void main(String[] args) {

		try(Reader r = new BufferedReader(new FileReader("D:\\Extra_Space_For_FOS_2\\rr\\1a.TXT"))){
	
			if(r.markSupported()) {
				
				BufferedReader in = (BufferedReader)r;
				System.out.println(in.readLine());  // 1        o_th index
				System.out.println(in.readLine());  // 2        1_st index
				in.mark(1);                                 // after 2 come 3 so we are marking on 2nd index
				
				System.out.println(in.readLine());  // 3 
				System.out.println(in.readLine());  // 4
				in.reset();
				
				System.out.println(in.readLine());
				in.reset();
				
				System.out.println(in.readLine());
				
			}else {
				System.out.println("Mark not supported");
			}
		
		}catch (Exception e) {

		e.printStackTrace();
		}
		
	}
}
