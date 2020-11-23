package app_13;

import java.util.function.Consumer;

public class Test {

	
	   public static void main(String[] args) {
		   
		
		Consumer<Integer> c = System.out::println;
		
		Integer i = 5;
		c.andThen(c).accept(i++);
		
		
//easy to understand  just draw in mind     c.accept(i++);  andThen  c.accept(i++);
// because Consumer does not return anything so  calling   andThen()    method on consumer
// will never take the old value and increment it, no it will never do like this 
// as it is a consumer so it will never return anything.		
		
		
//just draw in mind that their is only one  i=5;  as it is in one line so we are calling

//in one line statement so every time 5 value will be called , if we in 2 different line statements
//then it means we are calling  (i++)  in the next iteration then it will show us the incremented value
		
		
		
		
		
        Consumer<Integer> c2 = x -> System.out.println(x);
		Integer i2 = 5;
		c2.andThen(c2).accept(i++);
	
		
	}

}
