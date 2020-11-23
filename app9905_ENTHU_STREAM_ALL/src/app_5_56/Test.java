package app_5_56;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test {

	public static void main(String[] args) {

		IntStream is1 = IntStream.range(1, 3);
		IntStream is2 = IntStream.rangeClosed(1, 3);
		IntStream is3 = IntStream.concat(is1, is2);
		
		Object x = is3.boxed().collect(Collectors.groupingBy(k -> k)).get(3);
		System.out.println(x);
		
		// Note:    as .collect()  method return a List   so we can call  List  Interface   .get(keys/object) method
		
	//  so we are passing the object  and the 
	}

}
