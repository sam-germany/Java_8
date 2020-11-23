package app_2_86;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) throws IOException {

		Stream<String> ref = new BufferedReader(new FileReader("D:\\Extra_Space_For_FOS\\qqq.TXT")).lines();
		
		System.out.println(ref.count());
		
		
		System.out.println("--------------------");
		
		
		Stream<String> ref2 = Files.lines(Paths.get("D:\\\\Extra_Space_For_FOS\\\\qqq.TXT"));
		
		ref2.forEach(System.out::println);
		
	}

}
//  Files.lines()  method return  Stream<String>