package app_1_59;

import java.util.Optional;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		

        Stream<String> str = Stream.of("one","two","three");
		
		Optional<String> op = str.filter( x -> x.length() > 5)
				                 .findFirst()
				                 .flatMap( s -> Optional.of("444"));  //  as nothing is coming in the Stream
		                                                              //  so  s -> Optional.of("444"); will
		System.out.println(op);                                      // not be called
		
		
		
		System.out.println("----------------------------");
		
		
		
		
		
		Stream<String> str2 = Stream.of("one","two","threee", "tewnty");
		
		Optional<String> op2 = str2.filter( x -> x.length() > 5)
				                 .findFirst()
				                 .flatMap( s -> Optional.of("444"));
		
		System.out.println(op2); // in this case 2 String are coming from filter() after passing condition
	}                            // but .findFirst()  allow only one so only one time Optional[444]  will 
	                            // be printed
	
	//Note: we are calling on a Terminal Operator  .flatMap()  it is alloweed  hier. 

}
