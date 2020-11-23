package app_2_54;

import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {

		Stream s = Stream.of(2, 0, 4, 1);
		
		System.out.println(    s.skip(2)
		     		            .limit(1)
			    	            .toArray()[0]
				           );
	}

}
