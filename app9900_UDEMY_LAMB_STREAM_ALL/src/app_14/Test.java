package app_14;

import java.util.function.Consumer;

class Counter{
	static int  t = 1;
}

public class Test {

	public static void main(String[] args) {

		Consumer<Integer> c1 = i -> Counter.t += i;

	    Consumer<Integer> p  = System.out::println;    //     x -> System.out.println(x);
	    
	    c1.andThen(p).accept(10);
	    
	    // read explenation
	   // c1.accept(10); makes it  11  
	   // p.accept(10);                   so we can not call    forEach() method on it 
	    
//main Point:  as consumer never return any value,   so in our case   c1   not return anything
// this is the reason   Counter.t += i;    10+1   does not returned so we never get 11 as output
	    
//   c1  take  10  and print 10   the operation we done inside c1  will never be returned	    
	    
	    
	}

}
