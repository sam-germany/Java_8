package app_3_62;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		
		Stream<Double>  s = Stream.of(12.1,12.5,12.9);
		
//     Stream l = s.flatMap(d -> d.intValue());  //  .flatMap() method take a argument, with this argument it take
		                                         // takes all the coming  values and create a  new Stream with all these values
	                                             // as in this line we do not use  Stream.of() method so we get
		                                         // error
		
		
		
		Stream<Integer> l = s.flatMap(d ->  Stream.of(d.intValue()));
			   
		System.out.println(l.collect(Collectors.toSet()));
	}
}
