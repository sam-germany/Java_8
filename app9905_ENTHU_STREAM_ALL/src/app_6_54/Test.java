package app_6_54;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {

		Stream<Integer> st1 = Stream.of(2,3,5,7,11,13);
		
		double  av = st1.filter(x -> {
			                      if(x > 10)  return true;
			                      else 
			                    	  return false;
		                        })
				       .peek(System.out::println)
				       .collect(Collectors.averagingInt(y -> y));    //Collectors.averagingInt()   return  double 
		                                                                                            
		System.out.println(av);
	}

}
