package app_3_58;

import java.util.Optional;

public class Test {

	public static void main(String[] args) {

		Optional<Integer> ops = Optional.of(new Integer(2222));   // this value we are putting hier is not attached
		System.out.println(ops.get());                            // in this whole code with the .compare(x,y) method
		                                                          // if .compare()  method condition true then
		                                                          // this Optional value will be printed
		              ops.filter(x -> Integer.compare(10, 12)> 0)
		                 .ifPresent(System.out::print);

		
		
        System.out.println("----");
		
        
                            ops.filter(x -> Integer.compare(12, 10)> 0)
                               .ifPresent(System.out::print);
        
        
        
		System.out.println("----");
		
		System.out.println(Integer.compare(10, 12));
		System.out.println(Integer.compare(12, 10));
	}

}
