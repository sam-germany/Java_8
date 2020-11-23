package app_13;

import java.util.function.Consumer;

public class Test2 {
	
	   static int i = 5;
	
	   public static void main(String[] args) {
		   
		
		Consumer<Integer> c = System.out::println;
		
		c.andThen(c).accept(i++);
		
		
		// eventhough we define this i variable as static then also it return   5   5 as output
		

		
	}

}
