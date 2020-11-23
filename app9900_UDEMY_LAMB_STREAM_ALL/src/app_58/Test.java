package app_58;

import java.time.LocalDate;
import java.util.Optional;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {

		Stream<LocalDate> s = Stream.of(LocalDate.of(2018, 1, 1),
				                        LocalDate.of(2018, 1, 1));
	
	
	  Optional<LocalDate> op = s.distinct().findAny();
	
	  System.out.println(op.isPresent()+ "----- "+op.get());
	
	
	
	
	
	}

}
