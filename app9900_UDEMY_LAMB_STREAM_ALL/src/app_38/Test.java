package app_38;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

interface StringConsumer1 extends Consumer<String>{
                                                     // Consumer  Interface has  abstract void accept() method
                                 	                 // but in this example we are redefining that  accept() method
	@Override                                       // as @Override
	default void accept(String t) {                 //   default void accept();       but hier we provide the body 
     System.out.println(t.toUpperCase());		     
	}                                                // so in StringConsumer1   we do not have any abstract method
}                                                    // this code will not compile
public class Test {
	public static void main(String[] args) {

		StringConsumer1 con = s -> System.out.println(s.toLowerCase());
		
		List<String> l = Arrays.asList("Dr","Mr","Miss","Mrs");
		l.forEach(con);
	}

}
