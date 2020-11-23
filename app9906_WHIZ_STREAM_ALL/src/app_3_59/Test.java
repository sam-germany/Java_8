package app_3_59;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {

		Stream<String> l = Stream.of("A","BB","CCC","AB","CCC");
		
		Map<Boolean, List<String>>  m = l.collect(Collectors.partitioningBy( (String s ) -> s.startsWith("C")  ));
		
		

		System.out.println(m);

		System.out.println(m.get(false));   
	
		System.out.println(m.get(true));
		
	}

}
