package app_3_51;

import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {

		Stream<String> s = Stream.of("java","OCAJP");
		
       System.out.println(s.   min((s1,s2) ->Integer.compare(s2.length(), s1.length()))   .get());
	
	
       
       Stream<String> str = Stream.of("java","OCAJP");
		
       System.out.println(str.   min((s1,s2) ->Integer.compare(s2.length(), s1.length()))  );
	
	
	}

}
