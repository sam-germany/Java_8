package app_1_34;

import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {

		Stream s1 = Stream.of("A","B");
		Stream s2 = Stream.of("1","2");
		
		Stream s3 = Stream.concat(s1, s2);  // 
		s3.forEach(System.out::print);
		
		
		
		System.out.println("-----------------------------------------------------");
		
		
		Stream s4 = Stream.of("A","B");
		Stream s5 = Stream.of("1","2");
		
		Stream s6 = Stream.concat(s4, s5).sorted();  
		s6.forEach(System.out::print);
		
		
		
		System.out.println("-----------------------------------------------------");
		
		Stream a1 = Stream.of("A","B");
		Stream a2 = Stream.of("1","2");
		
		Stream a3 = (    (Stream)Stream.concat(a1, a2).parallel()   )
				                                                     .sorted();
		
		a3.forEach(System.out::print);
	}

}
