package app_0_66;

import java.util.function.ToDoubleBiFunction;

public class Test {

	public static void main(String[] args) {

	ToDoubleBiFunction<Integer, Integer> op = (x,y) ->  x * y;
	
	System.out.println(op.applyAsDouble(5, 10));
	
	}
	

}
