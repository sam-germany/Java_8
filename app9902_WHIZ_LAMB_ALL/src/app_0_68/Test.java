package app_0_68;

import java.util.function.DoubleSupplier;
import java.util.function.ToDoubleBiFunction;

public class Test {

	public static void main(String[] args) {

		DoubleSupplier sups  = ()-> Math.random() *10;   // as we are calling .random() method of Math class
                                                       // without an argument so we have to call like this 
		System.out.println(sups.getAsDouble());        // with  Lambda Expression
	}                                                  // it return  double premitive
}
// Main point  Supplier never take a argument ,same hier we are calling a no argument Constructor