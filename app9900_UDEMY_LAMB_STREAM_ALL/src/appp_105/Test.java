package appp_105;

import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		List<String> l = Arrays.asList("1st","2nd","3rd","4th");
		
		System.out.println(  l.stream()
				              .filter(x -> x.endsWith("d"))
				              .reduce((s1,s2) -> s1 + s2)
				          );
		
		
		System.out.println(  l.stream()
	                          .filter(x -> x.endsWith("d"))
	                          .reduce("--",  (s1,s2) -> s1 + s2)
	          );
		
		
	}

}
