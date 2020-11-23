package app_1_53;

import java.util.stream.IntStream;

public class Test {

	public static void main(String[] args) {

		IntStream x = IntStream.of(3,2,1,5,3,4,5);
		
		System.out.println(   x.filter(e -> e >=3 )
				               .distinct()
				               .average()   );
	}

}
