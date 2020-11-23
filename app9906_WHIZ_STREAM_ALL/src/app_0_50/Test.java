package app_0_50;

import java.util.stream.DoubleStream;

public class Test {

	public static void main(String[] args) {

		DoubleStream s  = DoubleStream.of(2.0, 4.1, 6.0, 1.4);
		
		System.out.println(s.skip(1).limit(2).findAny()); //  Optional[4.1]  it return 

	
		System.out.println(s.skip(1).limit(2).findAny().orElse(2));  //   4.1  it return direct 
	}                                                                //       objet

}
