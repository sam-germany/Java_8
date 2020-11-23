package app_6_32;

import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {

		String s1 = "Life , . is hard to live";
		
		boolean flag = Stream.of(s1.split("[ . ,]"))
				             .anyMatch(x -> x.startsWith("a"));
		
		System.out.println(flag);
		
		
		
		
          String s2 = "Life , . is hard to live";
		
		  boolean flag1 = Stream.of(s2.split("[ . ,]"))
				             .anyMatch(x -> x.startsWith("h"));
		
		  System.out.println(flag1);
	}

}
