package app_49;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {

		Optional<String> op = Stream.of("red", "green").sorted().findFirst();
		
		System.out.println(op.get());
		
		
		// as we put   ("red","green")   string value inside strem, then this Stream autometically become 
		//   Stream of String type
         
		

		

	}

}
