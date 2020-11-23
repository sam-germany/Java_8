package app_2_41;

import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {

		Stream<String> ins1 = Stream.of("1","2","3","2","1").distinct();
		
		String result1 = ins1.collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
				             .toString();
		
		System.out.println(result1);
		
		
		
        Stream<String> ins2 = Stream.of("1","2","3","2","1").distinct();
		
		String result2 = ins2.collect( () -> new StringBuilder(), (x,y) -> x.append(y), (a,b) -> a.append(b))
				.toString();

		System.out.println(result2);
	}

}
