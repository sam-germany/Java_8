package app51_UDEMY_69;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) throws IOException{

		Stream<Path> pa = Files.walk(Paths.get("F:\\process"));
		
		pa.filter(p -> !Files.isDirectory(p)).forEach(
				p ->{
					try {
						Files.readAllLines(p).stream()
						       .forEach(System.out::println);
					}catch(IOException e) {
						System.out.println("Failed");
						
					}
				}
				
				);
	}

}
