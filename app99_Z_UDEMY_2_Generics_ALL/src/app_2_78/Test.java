package app_2_78;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		List<String> l = Arrays.asList("M","R","A","P");
		
		Collections.sort(l, null);
		
		l.stream().peek(System.out::print).forEach(System.out::print);
		
	
		
		//	Arrays.sort();  as we are using  List<String>   so Arrays.sort()  we can not use hier
		
	}

}
