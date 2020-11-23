package app_16;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException {
                                                       //   FileWriter() create new File if abc1.txt does
		                                            // not exists, if it exists  then it overrite with new one    
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\Extra_Space_For_FOS_2\\abc1.txt"))){
			
			bw.close();
		 //   bw.newLine();
			bw.write(2);
		}catch(IOException e) {
			System.out.println("IOException");
		}
	}

}
// in  BufferedWriter()  after closing if we try    bw.newLine()  or bw.write()  in both cases it will throw
// IOException 