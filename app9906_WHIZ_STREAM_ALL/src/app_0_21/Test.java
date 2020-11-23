package app_0_21;

import java.util.Optional;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {

		Stream<String>  s = Stream.of("A", "AB", "ABC", "ABCD","AB");
		
		Optional<String> out = s.filter( x -> x.length() > 2)
				                .filter(x -> x.indexOf("C") > -1)
				                .findFirst();  
		
		// .findFirst()   return  Optional<String>   if we write  String out =   then we will 
		//                                                                         get error
	
	
		
		          String out1 = s.filter( x -> x.length() > 2)
                                 .filter(x -> x.indexOf("C") > -1)
                                 .findFirst() 
	                             .orElse("None---");
		
		// now as .findFirst() return Optional so now we can call  .orElse() method 
	   //  .orElse();  return   String   so if we use   String out1 =    then we will get error
	}

}
