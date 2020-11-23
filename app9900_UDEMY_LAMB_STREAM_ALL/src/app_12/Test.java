package app_12;

import java.util.function.Consumer;

public class Test {

	public static void main(String[] args) {

		Consumer<String> c1 = x ->{
			   
	System.out.println(new StringBuilder(x)
                           			.reverse()
			                        .toString()  //  the data coming from StringBuilder() we are 
			                        .substring(2)); // converting that Data into String with this method
		                            };
		
		    c1.accept("abcdefgh");
	}

}
