package app_2_56;

import java.io.BufferedReader;
import java.io.FileReader;

public class Test {

	public static void reader1(String file1) throws Exception{
		
		try(FileReader fr = new FileReader(file1))
		{
		int charRead= 0;
		
		while( (charRead = fr.read()) != -1) {         //  FileReader  .read() method return  -1 when file is empty
			                                           // if file is not empty then .read() method read char by char
			System.out.println( charRead);
		}
		}}
	
	
	public static void reader2(String file2) throws Exception{
		
		FileReader fr1 = new FileReader(file2);
		try(BufferedReader br = new BufferedReader(fr1))
		{
		String charRead= null;
		
		while( (charRead = br.readLine()) != null) {    // readLine() method of BufferedReader return String
			                                             // and it return null when file is empty
			System.out.println( charRead);
		}
		}}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
