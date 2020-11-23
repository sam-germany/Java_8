package app_2_57;

import java.util.Optional;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {

		Stream<String> s1 = Stream.of("OCAJP","OCM","OCA","OCEA");
		
		Optional<String> ops1 = s1.findAny();
		
		ops1.ofNullable(null)
		    .ifPresent(System.out::print);  // as hier  Optional is not present so .ifPresent()
                                              // will not be executed in both cases		
		System.out.println(ops1 +"===");
		
		
		
		System.out.println("-------------------------");
		
		
		
        Stream<String> s2 = Stream.of();
		
		Optional<String> ops2 = s2.findAny();
		
		ops2.ofNullable(null)
		    .ifPresent(System.out::print);
	
		System.out.println(ops2+"----");
	}

}
