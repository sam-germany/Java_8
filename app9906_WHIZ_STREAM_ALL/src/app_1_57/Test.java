package app_1_57;

import java.util.stream.DoubleStream;

public class Test {

	public static void main(String[] args) {

		DoubleStream x = DoubleStream.of(1.1, 1.0, 0.8, 0.6, 1.5);
		
		                   x.skip(2)
                    		.peek( in -> System.out.println((int)in))
		                    .limit(2)
		                    .allMatch( d ->  d<1 );
		
		
		
	}

}
